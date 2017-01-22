package com.example.siyounglee.androidweek0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onButtonClicked2 (View v){
        finish();
    }
}
