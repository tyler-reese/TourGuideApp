package com.example.android.tourguideapp;

public class Attraction {

    private int mNameId;
    private int mInfoId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int nameId, int infoId) {
        mNameId = nameId;
        mInfoId = infoId;
    }

    public Attraction(int nameId, int infoId, int imageResourceId) {
        mNameId = nameId;
        mInfoId = infoId;
        mImageResourceId = imageResourceId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getInfoId() {
        return mInfoId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}