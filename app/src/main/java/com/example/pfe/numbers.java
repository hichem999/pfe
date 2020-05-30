package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class numbers extends AppCompatActivity {

    private Button number_1;
    private Button number_2;
    private Button number_3;
    private Button number_4;
    private Button number_5;
    private Button number_6;
    public MediaPlayer player;

    public void init() {
        player = MediaPlayer.create(this, R.raw.cliquer_sur_un_chiffre);
        player.setLooping(false);
        player.start();
        number_1 = findViewById(R.id.number_1);
        number_2 = findViewById(R.id.number_2);
        number_3 = findViewById(R.id.number_3);
        number_4 = findViewById(R.id.number_4);
        number_5 = findViewById(R.id.number_5);
        number_6 = findViewById(R.id.number_6);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.number_1_sound);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.number_2_sound);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.number_3_sound);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.number_4_sound);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.number_5_sound);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.number_6_sound);
        number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent start = new Intent(numbers.this, Number1Example.class);
                startActivity(start);
                player.stop();
            }
        });
        number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                /*Intent start = new Intent(letters.this, letterDExample1.class);
                startActivity(start);
                player.stop();*/
            }
        });
        number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                /*Intent start = new Intent(letters.this, letterDExample1.class);
                startActivity(start);
                player.stop();*/
            }
        });
        number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                /*Intent start = new Intent(letters.this, letterDExample1.class);
                startActivity(start);
                player.stop();*/
            }
        });
        number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                /*Intent start = new Intent(letters.this, letterDExample1.class);
                startActivity(start);
                player.stop();*/
            }
        });
        number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                /*Intent start = new Intent(letters.this, letterDExample1.class);
                startActivity(start);
                player.stop();*/
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        init();
    }
}
