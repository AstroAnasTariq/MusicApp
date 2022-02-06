package com.example.android.musicapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button registerButton = findViewById(R.id.buttonRegister);
        registerButton.setOnClickListener(this);
        Button loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(this);
        Button logintoViaFacebook = findViewById(R.id.loginViaFacebook);
        logintoViaFacebook.setOnClickListener(this);
        Button logintoViaGoogle = findViewById(R.id.loginViaGoogle);
        logintoViaGoogle.setOnClickListener(this);

        Button nowIsPlayingTopMenuButton = findViewById(R.id.settingsMenuNowIsPlaying);
        nowIsPlayingTopMenuButton.setOnClickListener(this);
        Button albumsTopMenuButton = findViewById(R.id.settingsMenuAlbums);
        albumsTopMenuButton.setOnClickListener(this);
        Button artistTopMenuButton = findViewById(R.id.settingsMenuArtist);
        artistTopMenuButton.setOnClickListener(this);
        Button musicStoreTopMenuButton = findViewById(R.id.settingsMenuMusicStore);
        musicStoreTopMenuButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.settingsMenuNowIsPlaying:
                Intent nowIsPlayingIntent = new Intent(SettingsActivity.this, NowIsPlayingActivity.class);
                startActivity(nowIsPlayingIntent);
                break;
            case R.id.settingsMenuAlbums:
                Intent AlbumsIntent = new Intent(SettingsActivity.this, AlbumsActivity.class);
                startActivity(AlbumsIntent);
                break;
            case R.id.settingsMenuArtist:
                Intent ArtistIntent = new Intent(SettingsActivity.this, ArtistActivity.class);
                startActivity(ArtistIntent);
                break;
            case R.id.settingsMenuMusicStore:
                Intent MusicStoreIntent = new Intent(SettingsActivity.this, MusicStore.class);
                startActivity(MusicStoreIntent);
                break;
            case R.id.buttonRegister:
                Toast.makeText(getApplicationContext(), R.string.settings_register_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLogin:
            case R.id.loginViaFacebook:
            case R.id.loginViaGoogle:
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}