package me.artur.mylibrary;

import android.content.Context;
import android.content.Intent;
import javax.inject.Inject;

/**
 * @author Artur Badretdinov (Gaket) 02.08.2018
 */
public abstract class BroadcastReceiver extends android.content.BroadcastReceiver {

  public Business business;

  @Override
  public void onReceive(Context context, Intent intent) {

    if (business == null) {
      business = getBusiness();
    }
    business.doWork();
  }

  protected abstract Business getBusiness() ;
}
