package me.artur.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import javax.inject.Inject;
import me.artur.daggertest.di.DaggerAppComponent;
import me.artur.mylibrary.BroadcastReceiver;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.ComponentManager;
import me.artur.mylibrary.DepB;
import me.artur.mylibrary.di.SubModule;
import me.artur.myview.View;

public class MainActivity extends AppCompatActivity {

  @Inject
  DepB depB;

  @Inject
  Presenter presenter;

  @Inject
  Business business;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DaggerAppComponent.create().inject(this);
    ComponentManager.initSubcomponent(business);

    BroadcastReceiver broadcastReceiver = new BroadcastReceiver();
    Boolean theSameBusiness = broadcastReceiver.business.equals(business);

    Toast.makeText(this,  theSameBusiness.toString(), Toast.LENGTH_SHORT).show();
  }
}
