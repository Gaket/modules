package me.artur.myview;

import me.artur.mylibrary.Business;
import me.artur.mylibrary.LibraryInit;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class Presenter {

  public Business business;
  public LibraryInit mybusiness;

  public Presenter(Business business) {
    this.business = business;
  }
}
