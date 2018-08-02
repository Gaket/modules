package me.artur.daggertest.di;

import dagger.Component;
import javax.inject.Singleton;
import me.artur.daggertest.BroadcastMain;
import me.artur.daggertest.MainActivity;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {

  public void inject(BroadcastMain activity);

  AppSubComponent plusSubComponent();

  void inject(MainActivity activity);
}
