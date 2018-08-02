package me.artur.mylibrary.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.util.Iterator;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Module
public class AppModule {

  Iterator iterator;

  public AppModule(Iterator iterator) {
    this.iterator = iterator;
  }

  @Provides
  Iterator getIterator() {
    return iterator;
  }




}
