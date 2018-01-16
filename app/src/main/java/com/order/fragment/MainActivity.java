package com.order.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager=getFragmentManager();

        FragmentTransaction ft=manager.beginTransaction();
        ft.replace(R.id.main,new FirstFragment());

        ft.commit();




    }
}
