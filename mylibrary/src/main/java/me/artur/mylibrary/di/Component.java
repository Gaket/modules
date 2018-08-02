package me.artur.mylibrary.di;


import me.artur.mylibrary.BroadcastReceiver;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.MainBusinessLogic;
import me.artur.mylibrary.archieve.SubComponent;
import me.artur.mylibrary.archieve.SubModule;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@dagger.Component(modules = LibModule.class)
@LibraryScope
public interface Component {

  void inject(Business business);

  SubBusiness plusSubBusiness(BusinessModule businessModule);

  void inject(MainBusinessLogic mainBusinessLogic);
}
