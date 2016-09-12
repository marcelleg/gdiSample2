package com.gibblicious.gdi.sample2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "ThirdActivity";
    private TextView phoneNumberEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setupViews();
    }

    private void setupViews() {
        phoneNumberEntered = (TextView) findViewById(R.id.phone_entered);
        EditText et = (EditText) findViewById(R.id.edit_text_phone);
        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {

                StringBuilder result = new StringBuilder();
                result.append("The phone number you entered is: ");
                result.append(textView.getText());

                phoneNumberEntered.setText(result.toString());

                return true;
            }
        });
    }
}
