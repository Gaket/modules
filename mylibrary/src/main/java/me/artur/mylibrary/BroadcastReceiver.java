package me.artur.mylibrary;

import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class BroadcastReceiver {

  @Inject
  public Business business;

  public BroadcastReceiver() {
    ComponentManager.subComponent.inject(this);
  }

}
