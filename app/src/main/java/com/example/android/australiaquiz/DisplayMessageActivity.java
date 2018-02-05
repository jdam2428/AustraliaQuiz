package com.example.android.australiaquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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
        int score = 0;

        // Q1
        EditText nameField = findViewById(R.id.insert_name);
        String q1Answer = nameField.getText().toString();
        if (q1Answer.equals("Canberra")) {
            score = score + 1;
        }


        // Q2
        RadioButton q2RadioButton = findViewById(R.id.q2_radio_button_1);
        if (q2RadioButton.isChecked()) {
            score = score + 1;
        }


        // Q3
        RadioButton q3RadioButton = findViewById(R.id.q3_radio_button_1);
        if (q3RadioButton.isChecked()) {
            score = score + 1;
        }


        // Q4
        CheckBox q4_1 = findViewById(R.id.quiksilver_checkbox);
        CheckBox q4_2 = findViewById(R.id.billabong_checkbox);
        CheckBox q4_3 = findViewById(R.id.roxy_checkbox);
        if (q4_1.isChecked() && q4_2.isChecked() && q4_3.isChecked()) {
            score = score + 1;
        }

        // Q5
        RadioButton q5RadioButton = findViewById(R.id.q5_radio_button_2);
        if (q5RadioButton.isChecked()) {
            score = score + 1;
        }

        // Q6
        RadioButton q6RadioButton = findViewById(R.id.q6_radio_button_2);
        if (q6RadioButton.isChecked()) {
            score = score + 1;
        }

        // Q7
        RadioButton q7RadioButton = findViewById(R.id.q7_radio_button_3);
        if (q7RadioButton.isChecked()) {
            score = score + 1;
        }

        // Q8
        RadioButton q8RadioButton = findViewById(R.id.q8_radio_button_3);
        if (q8RadioButton.isChecked()) {
            score = score + 1;
        }

        Intent intent = new Intent(this, DisplayResultActivity.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
    }
}