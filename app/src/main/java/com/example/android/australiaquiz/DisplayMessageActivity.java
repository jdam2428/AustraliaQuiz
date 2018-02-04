package com.example.android.australiaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    /**
     * Called when the user taps the Submit button
     */
    public void onClick(View view) {
        Intent intent = new Intent(this, DisplayResultActivity.class);
        startActivity(intent);
    }
}
