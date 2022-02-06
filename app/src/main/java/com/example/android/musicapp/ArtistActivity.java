package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.android.musicapp.Artist.Artist;
import com.example.android.musicapp.Artist.ArtistAdapter;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist(R.drawable.adele2, "Adele", "Adele Laurie Blue Adkins MBE(born 5 May 1988)is aBritish singer and songwriter. After graduating from the BRIT School for Performing Arts and Technology in 2006, Adele was given a recording contract by XL Recordings ."));
        artists.add(new Artist(R.drawable.alan, "alanWalker", "Alan Olav Walker (born 24 August 1997), formerly known by his stage name DJ Walkzz, is a Norwegian record producer and DJ. He is best known for his 2015 single \"Faded\"."));
        artists.add(new Artist(R.drawable.hamaki, "Mohamed Hamaki", "Mohamed Ibrahim Hamaki born in Cairo, on November 4, 1975) is an Egyptian singer. In 2010, he won the award \"Best Arabia Act\" in the MTV Europe Music Awards and music award in 2006 for \"Ahla Haga Fiki\"."));
        artists.add(new Artist(R.drawable.whitney, "Whitney Houston", "Whitney Elizabeth Houston (August 9, 1963 – February 11, 2012) was an American singer, actress, producer, and model. In 2009, Guinness World Records cited her as the most awarded female act of all time."));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

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
                Intent nowIsPlayingIntent = new Intent(ArtistActivity.this, NowIsPlayingActivity.class);
                startActivity(nowIsPlayingIntent);
                break;
            case R.id.settingsMenuAlbums:
                Intent AlbumsIntent = new Intent(ArtistActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
                break;
            case R.id.settingsMenuMusicStore:
                Intent MusicStoreIntent = new Intent(ArtistActivity.this, MusicStore.class);
                startActivity(MusicStoreIntent);
                break;
            case R.id.settingsTopMenuSettings:
                Intent SettingsIntent = new Intent(ArtistActivity.this, SettingsActivity.class);
                startActivity(SettingsIntent);
                break;
            case R.id.settingsTopMenuArtist:
                Intent ArtistIntent = new Intent(ArtistActivity.this, ArtistActivity.class);
                startActivity(ArtistIntent);
                break;
        }
    }
}
