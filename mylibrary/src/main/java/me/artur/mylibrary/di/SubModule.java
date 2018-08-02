package me.artur.mylibrary.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.DepA;
import me.artur.mylibrary.DepB;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Module
public class SubModule {

  private Business business;

  public SubModule(Business business) {
    this.business = business;
  }

  @Provides
  public Business getBusiness() {
    return business;
  }

  @Provides
  DepB depB() {
    return new DepB();
  }

  @Provides
  DepA depA() {
    return new DepA();
  }
}
