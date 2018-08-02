package me.artur.mylibrary;

import me.artur.mylibrary.di.Component;
import me.artur.mylibrary.di.DaggerComponent;
import me.artur.mylibrary.di.SubComponent;
import me.artur.mylibrary.di.SubModule;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public class ComponentManager {

  // static for simplicity
  public static Component component = DaggerComponent.create();
  public static SubComponent subComponent;

  public static void initSubcomponent(Business business) {
    subComponent = component.getSubcomponent(new SubModule(business));
  }

  public static void initLibComponent(Business business) {
    initSubcomponent(business);
  }
}
