package me.artur.mylibrary;

import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class Manager {

  @Inject
  public Business business;

  public Manager() {
    ComponentManager.subComponent.inject(this);
  }


}
