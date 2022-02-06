package com.example.android.musicapp.Artist;


public class Artist {
    private int mImageArtist;
    private String mArtistName;
    private String mAbout;

    public Artist(int ImageArtist, String ArtistName, String About) {
        mArtistName = ArtistName;
        mAbout = About;
        mImageArtist = ImageArtist;

    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAbout() {
        return mAbout;
    }

    public int getImageArtist() {
        return mImageArtist;
    }

}
