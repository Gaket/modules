package me.artur.mylibrary.di;

import dagger.Module;
import dagger.Provides;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.DepA;
import me.artur.mylibrary.DepB;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Module
public class SubModule {

  @Provides
  @SubScope
  Business getBussiness(DepA a, DepB b) {
    return new Business(a, b);
  }
}
