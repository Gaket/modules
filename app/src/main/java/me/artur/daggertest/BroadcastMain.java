package me.artur.daggertest;

import javax.inject.Inject;
import me.artur.daggertest.di.DaggerAppComponent;
import me.artur.mylibrary.BroadcastReceiver;
import me.artur.mylibrary.Business;

/**
 * @author Artur Badretdinov (Gaket) 03.08.2018
 */
public class BroadcastMain extends BroadcastReceiver {

  @Inject
  Business business;

  @Override
  protected Business getBusiness() {
    DaggerAppComponent.create().inject(this);
    return business;
  }
}
