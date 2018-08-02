package me.artur.mylibrary.di;

import dagger.Module;
import dagger.Provides;
import me.artur.mylibrary.Bussiness;
import me.artur.mylibrary.DepA;
import me.artur.mylibrary.DepB;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Module
public class SubModule {

  @Provides
  @SubScope
  Bussiness getBussiness(DepA a, DepB b) {
    return new Bussiness(a, b);
  }
}
