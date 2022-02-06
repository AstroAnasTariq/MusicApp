package com.example.android.musicapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class NowIsPlayingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView playButton = findViewById(R.id.playSongButton);
        playButton.setOnClickListener(this);
        ImageView previousSongButton = findViewById(R.id.previousSongButton);
        previousSongButton.setOnClickListener(this);
        ImageView nextSongButton = findViewById(R.id.nextSongButton);
        nextSongButton.setOnClickListener(this);
        ImageView repeatButton = findViewById(R.id.repeatButton);
        repeatButton.setOnClickListener(this);
        ImageView shuffleButton = findViewById(R.id.shuffleButton);
        shuffleButton.setOnClickListener(this);
        ImageView favoriteButton = findViewById(R.id.favorite_button);
        favoriteButton.setOnClickListener(this);
        ImageView albumsButton = findViewById(R.id.albums_button);
        albumsButton.setOnClickListener(this);
        ImageView playlistButton = findViewById(R.id.playlist_button);
        playlistButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playSongButton:
                Toast.makeText(getApplicationContext(), "Song is playing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.previousSongButton:
                Toast.makeText(getApplicationContext(), "Switched to previous song", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nextSongButton:
                Toast.makeText(getApplicationContext(), "Switched to next song", Toast.LENGTH_SHORT).show();
                break;
            case R.id.repeatButton:
                Toast.makeText(getApplicationContext(), "Song will be repeated", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shuffleButton:
                Toast.makeText(getApplicationContext(), "Shuffle has been enabled", Toast.LENGTH_SHORT).show();
                break;
            case R.id.favorite_button:
                Toast.makeText(getApplicationContext(), "Song added to favorites", Toast.LENGTH_SHORT).show();
                break;
            case R.id.albums_button:
                Intent AlbumsIntent = new Intent(NowIsPlayingActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
                break;
            case R.id.playlist_button:
                Toast.makeText(getApplicationContext(), "Song added to playlist", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
