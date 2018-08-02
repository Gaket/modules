package me.artur.myview;

import javax.inject.Inject;
import me.artur.mylibrary.Bussiness;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class Presenter {

  private Bussiness bussiness;

  public Presenter(Bussiness bussiness) {
    this.bussiness = bussiness;
  }
}
