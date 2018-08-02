package me.artur.mylibrary.archieve;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * @author Artur Badretdinov (Gaket) 31.07.2018
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface SubScope {
}