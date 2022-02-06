package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.drawable.adele, "25", "Adele", R.drawable.ic_playlist_add_white_18dp, R.drawable.ic_play_arrow_white_18dp));
        songs.add(new Song(R.drawable.evolve, "Evolve", "Imagine Dragons", R.drawable.ic_playlist_add_white_18dp, R.drawable.ic_play_arrow_white_18dp));
        songs.add(new Song(R.drawable.coldplay, "Ghost Stories", "Cold Play", R.drawable.ic_playlist_add_white_18dp, R.drawable.ic_play_arrow_white_18dp));
        songs.add(new Song(R.drawable.breaking, "Dark Before Dawn", "Breaking Benjamin", R.drawable.ic_playlist_add_white_18dp, R.drawable.ic_play_arrow_white_18dp));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        Button nowIsPlayingTopMenuButton = findViewById(R.id.settingsMenuNowIsPlaying);
        nowIsPlayingTopMenuButton.setOnClickListener(this);
        Button albumsTopMenuButton = findViewById(R.id.settingsMenuAlbums);
        albumsTopMenuButton.setOnClickListener(this);
        Button musicStoreTopMenuButton = findViewById(R.id.settingsMenuMusicStore);
        musicStoreTopMenuButton.setOnClickListener(this);
        Button settingsTopMenuButton = findViewById(R.id.settingsTopMenuSettings);
        settingsTopMenuButton.setOnClickListener(this);
        Button artistTopMenuButton = findViewById(R.id.settingsTopMenuArtist);
        artistTopMenuButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.settingsMenuNowIsPlaying:
                Intent nowIsPlayingIntent = new Intent(AlbumsActivity.this, NowIsPlayingActivity.class);
                startActivity(nowIsPlayingIntent);
                break;
            case R.id.settingsMenuAlbums:
                Intent AlbumsIntent = new Intent(AlbumsActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
                break;
            case R.id.settingsMenuMusicStore:
                Intent MusicStoreIntent = new Intent(AlbumsActivity.this, MusicStore.class);
                startActivity(MusicStoreIntent);
                break;
            case R.id.settingsTopMenuSettings:
                Intent SettingsIntent = new Intent(AlbumsActivity.this, SettingsActivity.class);
                startActivity(SettingsIntent);
                break;
            case R.id.settingsTopMenuArtist:
                Intent ArtistIntent = new Intent(AlbumsActivity.this, ArtistActivity.class);
                startActivity(ArtistIntent);
                break;
        }
    }
}
