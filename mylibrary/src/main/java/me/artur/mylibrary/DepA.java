package me.artur.mylibrary;

import javax.inject.Inject;
import me.artur.mylibrary.di.SubScope;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@SubScope
public class DepA {

  @Inject
  public DepA() {
  }
}
