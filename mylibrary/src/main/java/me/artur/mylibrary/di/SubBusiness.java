package me.artur.mylibrary.di;

import dagger.Subcomponent;
import me.artur.mylibrary.BroadcastReceiver;

/**
 * @author Artur Badretdinov (Gaket) 03.08.2018
 */
@Subcomponent(modules = BusinessModule.class)
public interface SubBusiness {

  void inject(BroadcastReceiver broadcastReceiver);
}
