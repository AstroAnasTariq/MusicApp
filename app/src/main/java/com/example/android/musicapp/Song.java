package com.example.android.musicapp;


public class Song {
    private int mImage;
    private String mAlbumName;
    private String mArtist;
    private int mAddToPlayList;
    private int mPlayAlbum;

    public Song(int Image, String AlbumName, String Artist, int AddToPlayList, int PlayAlbum) {
        mAlbumName = AlbumName;
        mArtist = Artist;
        mImage = Image;
        mAddToPlayList = AddToPlayList;
        mPlayAlbum = PlayAlbum;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImage() {
        return mImage;
    }

    public int getAddToPlayList() {
        return mAddToPlayList;
    }

    public int getPlayAlbum() {
        return mPlayAlbum;
    }

}
