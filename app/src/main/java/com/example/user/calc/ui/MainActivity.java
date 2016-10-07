package com.example.user.calc.ui;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.user.calc.Config;
import com.example.user.calc.R;

public class MainActivity extends AppCompatActivity {

    CalcFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = new CalcFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.activity_main, firstFragment);
        fragmentTransaction.commit();


        Log.d(Config.TAG, "MainActivity - onCreate");

    }
}