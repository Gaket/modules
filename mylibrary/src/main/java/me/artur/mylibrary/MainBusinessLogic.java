package me.artur.mylibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class MainBusinessLogic {

  @Inject
  VolumeManager business;

  /**
   * Constructor
   */
  public MainBusinessLogic(Business business){
    LibComponentManager.init(business).inject(this);
  }

}
