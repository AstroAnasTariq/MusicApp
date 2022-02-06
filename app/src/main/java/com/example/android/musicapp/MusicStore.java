package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.android.musicapp.Store.Store;
import com.example.android.musicapp.Store.StoreAdapter;

import java.util.ArrayList;

public class MusicStore extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Store> stores = new ArrayList<Store>();
        stores.add(new Store(R.drawable.imaginedragonsbeliever, "Imagine Dragons", "Believer", R.drawable.ic_info_outline_white_18dp, R.drawable.ic_shopping_cart_white_18dp));
        stores.add(new Store(R.drawable.dearagony, "Breaking Benjamin", "Dear Agony", R.drawable.ic_info_outline_white_18dp, R.drawable.ic_shopping_cart_white_18dp));
        stores.add(new Store(R.drawable.allfallsdwon, "Alan Walker", "All Falls Down", R.drawable.ic_info_outline_white_18dp, R.drawable.ic_shopping_cart_white_18dp));
        stores.add(new Store(R.drawable.lethergo, "Passenger", "Let Her Go", R.drawable.ic_info_outline_white_18dp, R.drawable.ic_shopping_cart_white_18dp));

        StoreAdapter adapter = new StoreAdapter(this, stores);

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
                Intent nowIsPlayingIntent = new Intent(MusicStore.this, NowIsPlayingActivity.class);
                startActivity(nowIsPlayingIntent);
                break;
            case R.id.settingsMenuAlbums:
                Intent AlbumsIntent = new Intent(MusicStore.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
                break;
            case R.id.settingsMenuMusicStore:
                Intent MusicStoreIntent = new Intent(MusicStore.this, MusicStore.class);
                startActivity(MusicStoreIntent);
                break;
            case R.id.settingsTopMenuSettings:
                Intent SettingsIntent = new Intent(MusicStore.this, SettingsActivity.class);
                startActivity(SettingsIntent);
                break;
            case R.id.settingsTopMenuArtist:
                Intent ArtistIntent = new Intent(MusicStore.this, ArtistActivity.class);
                startActivity(ArtistIntent);
                break;
        }
    }
}
