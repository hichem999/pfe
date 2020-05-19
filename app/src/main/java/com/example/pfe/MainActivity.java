package com.example.pfe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button startButton;
    public Button aPropos;
    public MediaPlayer player;

    public void init() {
        player = MediaPlayer.create(this, R.raw.song);
        player.setLooping(false);
        player.start();
        startButton = (Button) findViewById(R.id.startButton);
        aPropos = (Button) findViewById(R.id.aPropos);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, home.class);
                startActivity(start);
                player.stop();
            }
        });

        aPropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, AProposActivity.class);
                startActivity(start);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}
