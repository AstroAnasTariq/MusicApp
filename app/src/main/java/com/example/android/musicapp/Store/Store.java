package com.example.android.musicapp.Store;

public class Store {
    private int mImage;
    private String mNameOfBand;
    private String mTitleOfAlbum;
    private int mInfoAlbum1;
    private int mAddToShoppingCartAlbum1;

    public Store(int Image, String NameOfBand, String TitleOfAlbum, int InfoAlbum1, int AddToShoppingCartAlbum1) {
        mNameOfBand = NameOfBand;
        mTitleOfAlbum = TitleOfAlbum;
        mImage = Image;
        mInfoAlbum1 = InfoAlbum1;
        mAddToShoppingCartAlbum1 = AddToShoppingCartAlbum1;
    }

    public String getNameOfBand() {
        return mNameOfBand;
    }

    public String getTitleOfAlbum() {
        return mTitleOfAlbum;
    }

    public int getImage() {
        return mImage;
    }

    public int getInfoAlbum1() {
        return mInfoAlbum1;
    }

    public int getAddToShoppingCartAlbum1() {
        return mAddToShoppingCartAlbum1;
    }

}

