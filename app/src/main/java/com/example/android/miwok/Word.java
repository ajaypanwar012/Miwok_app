package com.example.android.miwok;

public class Word {

    private  String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourseID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED= -1;

    public Word(String defaultTranslation , String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation , String miwokTranslation, int ImageResourseID){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourseID = ImageResourseID;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return  mMiwokTranslation;
    }

    public int getmImageResourseID() {return mImageResourseID;}

    public boolean hasImage(){
        return mImageResourseID != NO_IMAGE_PROVIDED;
    }
}
