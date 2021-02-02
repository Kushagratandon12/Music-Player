package com.example.hp.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer mediaPlayer;
    ImageView imgClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);

        imgClick = (ImageView) findViewById(R.id.start);

        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();


            }
        });

        imgClick = (ImageView) findViewById(R.id.stop);

        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();

            }
        });
        imgClick = (ImageView) findViewById(R.id.forward);

        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Replay", Toast.LENGTH_SHORT).show();
                mediaPlayer.seekTo(10);


            }
        });

    }
}
