package me.artur.mylibrary.archieve;

import dagger.Subcomponent;
import me.artur.mylibrary.BroadcastReceiver;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.MainBusinessLogic;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Subcomponent(modules = SubModule.class)
@SubScope
public interface SubComponent {

  void inject(BroadcastReceiver broadcastReceiver);

  void inject(MainBusinessLogic mainBusinessLogic);

  void inject(Business business);
}
