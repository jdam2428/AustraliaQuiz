package com.example.android.australiaquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class DisplayResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
    }

    /**
     * Called when the user taps the get result button
     */
    public void getResult(View view) {
        int score = getIntent().getIntExtra("SCORE", 0);
        Context context = getApplicationContext();
        CharSequence text = "Your score is " + score + "/8.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    /**
     * Called when the user taps the restart button
     */
    public void restartButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
