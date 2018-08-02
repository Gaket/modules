package me.artur.mylibrary.di;

import dagger.Module;
import dagger.Provides;
import me.artur.mylibrary.Business;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Module
public class ExternalDeps {

  private Business business;

  public ExternalDeps(Business business) {
    this.business = business;
  }

  @Provides
  Business bussiness(){
    return business;
  }
}
