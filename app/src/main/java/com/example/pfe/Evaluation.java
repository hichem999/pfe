package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Evaluation extends AppCompatActivity {
    private Button button_numbers_evaluation;
    private Button button_letters_evaluation;

    public void init() {
        button_numbers_evaluation = findViewById(R.id.button_numbers_evaluation);
        button_numbers_evaluation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(Evaluation.this, NumbersEvaluation.class);
                startActivity(start);
            }
        });
        button_letters_evaluation = findViewById(R.id.button_letters_evaluation);
        button_letters_evaluation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(Evaluation.this, LettersEvaluation.class);
                startActivity(start);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        init();
    }
}
