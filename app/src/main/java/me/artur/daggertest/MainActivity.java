package me.artur.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import javax.inject.Inject;
import me.artur.daggertest.di.DaggerAppComponent;
import me.artur.mylibrary.DepB;
import me.artur.myview.View;

public class MainActivity extends AppCompatActivity {

  @Inject
  View view;
  @Inject
  DepB depB;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    DaggerAppComponent.create().plusSubComponent().inject(this);

    Log.d("", view.toString());
  }
}
