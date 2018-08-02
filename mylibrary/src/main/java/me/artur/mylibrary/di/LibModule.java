package me.artur.mylibrary.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.util.Iterator;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.DepA;
import me.artur.mylibrary.DepB;
import me.artur.mylibrary.VolumeManager;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Module
public class LibModule {
  // some providers here

  Business business;

  public LibModule(Business business) {
    this.business = business;
  }

//  @Provides
//  public Business getBusiness() {
//    return business;
//  }

  @Provides
  DepB depB() {
    return new DepB();
  }

  @Provides
  DepA depA() {
    return new DepA();
  }

  @Provides
  VolumeManager volumeManager() {
    return new VolumeManager(business);
  }
}
