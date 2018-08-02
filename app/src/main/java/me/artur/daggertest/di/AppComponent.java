package me.artur.daggertest.di;

import dagger.Component;
import javax.inject.Singleton;
import me.artur.daggertest.MainActivity;
import me.artur.mylibrary.di.AppModule;
import me.artur.mylibrary.di.SubComponent;
import me.artur.mylibrary.di.SubModule;
import me.artur.myview.di.ViewModule;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

  AppSubComponent plusSubComponent();
}
