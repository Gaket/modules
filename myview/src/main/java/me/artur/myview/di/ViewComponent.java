package me.artur.myview.di;

import dagger.Component;
import me.artur.mylibrary.archieve.SubModule;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
@Component(modules = {ViewModule.class, SubModule.class})
public interface ViewComponent {

}
