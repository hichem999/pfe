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
    public MediaPlayer player;
    private Button letters_next;


    public void init() {
        player = MediaPlayer.create(this, R.raw.cliquer_sur_une_lettre);
        player.setLooping(false);
        player.start();
        letter_a = findViewById(R.id.letter_a);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.letter_a_sound);
        letter_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent start = new Intent(letters.this, letterAExample1.class);
                startActivity(start);
                player.stop();
            }
        });
        letters_next = findViewById(R.id.letters_next);
        letters_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(letters.this, letters2.class);
                startActivity(start);
                player.stop();
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
