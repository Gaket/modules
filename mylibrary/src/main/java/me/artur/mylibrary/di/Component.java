package me.artur.mylibrary.di;


import me.artur.mylibrary.Business;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@dagger.Component(modules = LibModule.class)
@LibraryScope
public interface Component {

  SubComponent getSubcomponent(Business business);

}
