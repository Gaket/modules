package me.artur.daggertest;

import javax.inject.Inject;
import me.artur.mylibrary.Business;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class Presenter {

  @Inject
  public Presenter(Business business) {
  }
}
