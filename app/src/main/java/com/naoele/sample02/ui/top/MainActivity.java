package com.naoele.sample02.ui.top;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.naoele.sample02.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){

        }
    }
}