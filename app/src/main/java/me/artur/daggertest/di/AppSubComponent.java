package me.artur.daggertest.di;

import dagger.Subcomponent;
import me.artur.daggertest.MainActivity;
import me.artur.mylibrary.di.SubModule;
import me.artur.mylibrary.di.SubScope;
import me.artur.myview.di.ViewModule;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Subcomponent(modules ={ SubModule.class,  ViewModule.class})
@SubScope
public interface AppSubComponent {

  public void inject(MainActivity activity);
}
