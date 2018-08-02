package me.artur.myview;

import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class View {

  Presenter presenter;

  public View(Presenter presenter) {
    this.presenter = presenter;
  }
}
