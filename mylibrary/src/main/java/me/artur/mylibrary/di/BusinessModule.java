package me.artur.mylibrary.di;

import dagger.Module;
import dagger.Provides;
import me.artur.mylibrary.Business;

/**
 * @author Artur Badretdinov (Gaket) 03.08.2018
 */
@Module
public class BusinessModule {

  private Business business;

  public BusinessModule(Business business) {
    this.business = business;
  }

  @Provides
  public Business getBusiness() {
    return business;
  }
}
