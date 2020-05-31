package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LettersEvaluation extends AppCompatActivity {

    private Button letter_a;
    private Button letter_b;
    private Button letter_c;
    private Button letter_d;
    private Button letter_e;

    public void init() {
        letter_a = findViewById(R.id.letter_a);
        final MediaPlayer number_1_player = MediaPlayer.create(this, R.raw.correct_number_sound);
        letter_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1_player.start();
            }
        });

        letter_b = findViewById(R.id.letter_b);
        final MediaPlayer number_2_player = MediaPlayer.create(this, R.raw.wrong_number_voice);
        letter_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        letter_c = findViewById(R.id.letter_c);
        letter_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        letter_d = findViewById(R.id.letter_d);
        letter_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });

        letter_e = findViewById(R.id.letter_e);
        letter_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2_player.start();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters_evaluation);
        init();
    }
}
