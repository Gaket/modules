package me.artur.daggertest.di;

import dagger.Component;
import javax.inject.Singleton;
import me.artur.mylibrary.di.LibModule;
import me.artur.mylibrary.di.SubModule;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Component(modules = {LibModule.class, SubModule.class})
@Singleton
public interface AppComponent {

  AppSubComponent plusSubComponent();
}
