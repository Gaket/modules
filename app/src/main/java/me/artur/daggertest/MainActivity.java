package me.artur.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
import me.artur.daggertest.di.DaggerAppComponent;
import me.artur.mylibrary.Business;
import me.artur.mylibrary.DepB;
import me.artur.mylibrary.MainBusinessLogic;

public class MainActivity extends AppCompatActivity {

  @Inject
  MainBusinessLogic business;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DaggerAppComponent.create().inject(this);

  }
}
