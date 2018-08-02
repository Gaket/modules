package me.artur.mylibrary;

import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
public class Business {

  DepA depA;
  DepB depB;

  public Business(DepA depA, DepB depB) {
    this.depA = depA;
    this.depB = depB;
  }
}
