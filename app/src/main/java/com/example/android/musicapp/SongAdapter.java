package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> implements View.OnClickListener {
    private Context mContext;

    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.menu_item, parent, false);
        }
        Song currentSong = getItem(position);

        ImageView nowIsPlayingTextView = listItemView.findViewById(R.id.coverOfAlbum1);
        nowIsPlayingTextView.setImageResource(currentSong.getImage());

        ImageButton imageButton = listItemView.findViewById(R.id.addToPlayListAlbumOne);
        imageButton.setImageResource(currentSong.getAddToPlayList());
        imageButton.setOnClickListener(this);

        ImageButton imageButton2 = listItemView.findViewById(R.id.playAlbum1);
        imageButton2.setImageResource(currentSong.getPlayAlbum());
        imageButton2.setOnClickListener(this);

        TextView albumTextView = listItemView.findViewById(R.id.nameOfBand1);
        albumTextView.setText(currentSong.getAlbumName());

        TextView ArtistTextView = listItemView.findViewById(R.id.artist_name);
        ArtistTextView.setText(currentSong.getArtist());

        return listItemView;

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playAlbum1:
               Toast.makeText(mContext, "Album is Playing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.addToPlayListAlbumOne:
                Toast.makeText(mContext, "Album has been added to playlist", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}