package me.artur.daggertest.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import me.artur.daggertest.AndroidClass;
import me.artur.daggertest.Presenter;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.DepA;
import me.artur.mylibrary.DepB;
import me.artur.mylibrary.LibraryInit;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Module
public class AppModule {

  @Provides
  @Singleton
  LibraryInit business(DepA depa, DepB depb) {
    return new Business(depa, depb);
  };

  @Provides
  AndroidClass androidClass() {
    return new AndroidClass();
  }

  @Provides
  Presenter presenter(Business business) {
    return new Presenter(business);
  }
}
