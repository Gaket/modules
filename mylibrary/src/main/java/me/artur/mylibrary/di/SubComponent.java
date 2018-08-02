package me.artur.mylibrary.di;

import dagger.Subcomponent;
import me.artur.mylibrary.Bussiness;
import me.artur.mylibrary.Manager;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Subcomponent(modules = SubModule.class)
@SubScope
public interface SubComponent {

  void inject(Manager manager);
}
