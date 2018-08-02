package me.artur.daggertest.di;

import dagger.Module;
import dagger.Provides;
import me.artur.daggertest.AndroidClass;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Module
public class AppModule {

  @Provides
  AndroidClass androidClass() {
    return new AndroidClass();
  }
}
