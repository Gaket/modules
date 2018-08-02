package me.artur.mylibrary;

import android.content.Context;
import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class LibraryInit {

  /**
   * Constructor
   */
  public LibraryInit(Business business){
    ComponentManager.initLibComponent(business);
  }

}
