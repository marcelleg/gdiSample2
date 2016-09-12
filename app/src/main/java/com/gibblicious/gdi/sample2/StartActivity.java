package com.gibblicious.gdi.sample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    private static final String TAG = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onMyButtonClick(View v) {
        Log.d(TAG, "onMyButtonClick");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
