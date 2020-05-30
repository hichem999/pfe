package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Number1Example extends AppCompatActivity {

    private Button speaker_button;
    public MediaPlayer player;

    public void init() {
        speaker_button = findViewById(R.id.speaker_button);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.number_1_example);
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
        setContentView(R.layout.activity_number1_example);
        init();
    }
}
