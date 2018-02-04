package com.example.android.australiaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    int score = 0;


    /**
     * Called when the user taps the get result button
     */
    public int getResult(View view) {
        EditText nameField = (EditText) findViewById(R.id.insert_name);
        String name = nameField.getText().toString();

        RadioButton statesRadioButton = findViewById(R.id.q2_radio_button_1);
        boolean hasStatesSix = statesRadioButton.isChecked();

        RadioButton fruitRadioButton = findViewById(R.id.q3_radio_button_1);
        boolean hasFruit = fruitRadioButton.isChecked();

        return score;
    }

    /**
     * Calculates the score of the user.
     *
     * @param addStates is whether or not the user has selected 6 states
     * @param addFruit is whether or not the user has selected fruit
     */
    public int calculateResult(boolean addStates, boolean addFruit) {
        int score = 0;
        if (addStates=true) {
            score = score + 1;
        }
        if (addFruit=true) {
            score = score + 1;
        }

        return score;
    }







    /**
     * Called when the user taps the restart button
     */
    public void restartButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
