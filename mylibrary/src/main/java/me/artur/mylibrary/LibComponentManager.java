package me.artur.mylibrary;

import android.support.annotation.NonNull;
import me.artur.mylibrary.di.Component;
import me.artur.mylibrary.di.DaggerComponent;
import me.artur.mylibrary.di.LibModule;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class LibComponentManager {

  // static for simplicity
  public static Component component = null;

  @NonNull
  public static Component init(Business business) {
    return component = DaggerComponent.builder().libModule(new LibModule(business)).build();
  }
}
