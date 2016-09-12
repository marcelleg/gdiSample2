package com.gibblicious.gdi.sample2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setupViews();
    }

    private void setupViews() {
        ImageView iv = (ImageView) findViewById(R.id.image_ket);
        ImageOnClickListener clickListener = new ImageOnClickListener();
        iv.setOnClickListener(clickListener);
    }

    private void startThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    private class ImageOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Log.d(TAG, "ImageView On Click Listener");
            startThirdActivity();
        }
    }
}
