package me.artur.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import javax.inject.Inject;
import me.artur.daggertest.di.DaggerAppComponent;
import me.artur.mylibrary.ComponentManager;
import me.artur.mylibrary.DepB;
import me.artur.mylibrary.Manager;
import me.artur.mylibrary.di.ExternalDeps;
import me.artur.myview.View;

public class MainActivity extends AppCompatActivity {

  @Inject
  View view;
  @Inject
  DepB depB;
//  @Inject
//  Iterator iterator;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DaggerAppComponent.create().plusSubComponent().inject(this);
    ComponentManager.initSubcomponent(new ExternalDeps(view.presenter.business));

    Manager manager = new Manager();
    Boolean theSameBusiness = manager.business.equals(view.presenter.business);

    Toast.makeText(this,  theSameBusiness.toString(), Toast.LENGTH_SHORT).show();
    Log.d("", view.toString());
  }
}
