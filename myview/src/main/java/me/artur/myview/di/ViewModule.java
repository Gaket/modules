package me.artur.myview.di;

import dagger.Module;
import dagger.Provides;
import me.artur.mylibrary.Business;
import me.artur.myview.Presenter;
import me.artur.myview.View;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Module
public class ViewModule {

  @Provides
  Presenter presenter(Business business) {
    return new Presenter(business);
  }

  @Provides
  View view(Presenter presenter) {
    return new View(presenter);
  }

}
