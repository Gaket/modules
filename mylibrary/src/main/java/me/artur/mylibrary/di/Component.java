package me.artur.mylibrary.di;


/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@dagger.Component
public interface Component {

  SubComponent getSubcomponent();
}
