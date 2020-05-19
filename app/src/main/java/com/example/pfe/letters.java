package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageButton;

public class letters extends AppCompatActivity {

    private Button letter_a;


    public void init() {
        letter_a = findViewById(R.id.letter_a);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.letter_a_sound);
        letter_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);
        init();
    }
}
