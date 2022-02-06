package com.example.android.musicapp.Store;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.musicapp.R;

import java.util.ArrayList;

public class StoreAdapter extends ArrayAdapter<Store> implements View.OnClickListener {
    private Context mContext;

    public StoreAdapter(Context context, ArrayList<Store> words) {
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
        Store currentStore = getItem(position);

        ImageView nowIsPlayingTextView = listItemView.findViewById(R.id.coverOfAlbum1);
        nowIsPlayingTextView.setImageResource(currentStore.getImage());

        ImageButton imageButton = listItemView.findViewById(R.id.addToPlayListAlbumOne);
        imageButton.setImageResource(currentStore.getAddToShoppingCartAlbum1());
        imageButton.setOnClickListener(this);

        ImageButton imageButton2 = listItemView.findViewById(R.id.playAlbum1);
        imageButton2.setImageResource(currentStore.getInfoAlbum1());
        imageButton2.setOnClickListener(this);

        TextView albumTextView = listItemView.findViewById(R.id.nameOfBand1);
        albumTextView.setText(currentStore.getNameOfBand());

        TextView ArtistTextView = listItemView.findViewById(R.id.artist_name);
        ArtistTextView.setText(currentStore.getTitleOfAlbum());

        return listItemView;

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playAlbum1:
                Toast.makeText(mContext, "Info about album", Toast.LENGTH_SHORT).show();
                break;
            case R.id.addToPlayListAlbumOne:
                Toast.makeText(mContext, "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}