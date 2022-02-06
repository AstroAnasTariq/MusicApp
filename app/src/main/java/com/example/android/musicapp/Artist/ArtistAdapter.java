package com.example.android.musicapp.Artist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.musicapp.R;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> implements View.OnClickListener {
    private Context mContext;

    public ArtistAdapter(Context context, ArrayList<Artist> words) {
        super(context, 0, words);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_artist, parent, false);
        }
        Artist currentArtist = getItem(position);

        ImageView artistImage = listItemView.findViewById(R.id.artistsImage);
        artistImage.setImageResource(currentArtist.getImageArtist());

        Button readMore = listItemView.findViewById(R.id.readMoreButtonArtist1);
        readMore.setOnClickListener(this);

        TextView albumTextView = listItemView.findViewById(R.id.artistsText);
        albumTextView.setText(currentArtist.getAbout());

        TextView ArtistTextView = listItemView.findViewById(R.id.artist_name);
        ArtistTextView.setText(currentArtist.getArtistName());

        return listItemView;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.readMoreButtonArtist1:
                Toast.makeText(mContext, "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}