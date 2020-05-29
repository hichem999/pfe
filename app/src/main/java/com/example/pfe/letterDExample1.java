package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class letterDExample1 extends AppCompatActivity {

    private Button speaker_button;
    public MediaPlayer player;

    public void init() {
        speaker_button = findViewById(R.id.speaker_button);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.letter_d_example);
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
        setContentView(R.layout.activity_letter_d_example1);
        init();
    }
}
