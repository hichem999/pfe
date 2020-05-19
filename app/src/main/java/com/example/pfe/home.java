package com.example.pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    private Button button_letters;
    public MediaPlayer player;

    public void init() {
        player = MediaPlayer.create(this, R.raw.home_sound);
        player.setLooping(false);
        player.start();
        button_letters = findViewById(R.id.button_letters);
        button_letters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(home.this, letters.class);
                startActivity(start);
                player.stop();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }
}
