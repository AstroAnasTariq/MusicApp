package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout nowIsPlaying = findViewById(R.id.nowIsPlaying);
        nowIsPlaying.setOnClickListener(this);
        LinearLayout albums = findViewById(R.id.albums);
        albums.setOnClickListener(this);
        LinearLayout artists = findViewById(R.id.artists);
        artists.setOnClickListener(this);
        LinearLayout musicStore = findViewById(R.id.musicStore);
        musicStore.setOnClickListener(this);
        LinearLayout settings = findViewById(R.id.settings);
        settings.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nowIsPlaying:
                Intent nowIsPlayingIntent = new Intent(MainActivity.this, NowIsPlayingActivity.class);
                startActivity(nowIsPlayingIntent);
                break;
            case R.id.albums:
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
                break;
            case R.id.artists:
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
                break;
            case R.id.musicStore:
                Intent musicStoreIntent = new Intent(MainActivity.this, MusicStore.class);
                startActivity(musicStoreIntent);
                break;
            case R.id.settings:
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                break;
        }
    }
}
