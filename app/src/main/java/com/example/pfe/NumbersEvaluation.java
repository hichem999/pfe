package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumbersEvaluation extends AppCompatActivity {

    private Button number_1;
    private Button number_2;
    private Button number_3;
    private Button number_4;
    private Button number_5;

    public void init() {
        number_1 = findViewById(R.id.number_1);
        final MediaPlayer number_1_player = MediaPlayer.create(this, R.raw.correct_number_sound);
        number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1_player.start();
            }
        });

        number_2 = findViewById(R.id.number_2);
        final MediaPlayer number_2_player = MediaPlayer.create(this, R.raw.wrong_number_voice);
        number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        number_3 = findViewById(R.id.number_3);
        number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        number_4 = findViewById(R.id.number_4);
        number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        number_5 = findViewById(R.id.number_5);
        number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_evaluation);
        init();
    }
}
