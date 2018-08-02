package me.artur.mylibrary;

import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
public class Business {

  @Inject
  DepA depA;
  @Inject
  DepB depB;

  public Business() {
    LibComponentManager.component.inject(this);
  }

  /**
   * TODO describe function
   */
  private void func1(){

  }

  public void doWork() {

  }
}
