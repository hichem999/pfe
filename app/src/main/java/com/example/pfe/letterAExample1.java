package com.example.pfe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class letterAExample1 extends AppCompatActivity {

    private Button speaker_button;
    public MediaPlayer player;

    public void init() {
        speaker_button = findViewById(R.id.speaker_button);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.armoire);
        speaker_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_a_example1);
        init();
    }
}
