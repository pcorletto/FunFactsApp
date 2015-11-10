package com.example.android.funfacts;

import java.util.Random;

/**
 * Created by hernandez on 11/9/2015.
 */
public class RandomRGBGen {

    // Member variables
    String mHexValue;
    Random mRandomGenerator = new Random();
    int mRandomNumber;
    int mDiv;
    String mDiv2;
    int mRemainder;
    String mRem2;

    // Methods

    public String getRandomHexVal(){

        // Randomly select a value between 0 - 255 for the value of our color
       // Construct a new Random number generator
        mRandomNumber = mRandomGenerator.nextInt(256);
        // Convert the generated decimal value to a hex value
        mDiv = mRandomNumber / 16;
        mDiv2 = "";
        mRemainder = mRandomNumber % 16;
        mRem2 = "";
        if (mDiv == 10) {
            mDiv2 = "A";
        } else if (mDiv == 11) {
            mDiv2 = "B";
        } else if (mDiv == 12) {
            mDiv2 = "C";
        } else if (mDiv == 13) {
            mDiv2 = "D";
        } else if (mDiv == 14) {
            mDiv2 = "E";
        } else if (mDiv == 15) {
            mDiv2 = "F";
        } else {
            mDiv2 = mDiv + "";
        }

        if (mRemainder == 10) {
            mRem2 = "A";
        } else if (mRemainder == 11) {
            mRem2 = "B";
        } else if (mRemainder == 12) {
            mRem2 = "C";
        } else if (mRemainder == 13) {
            mRem2 = "D";
        } else if (mRemainder == 14) {
            mRem2 = "E";
        } else if (mRemainder == 15) {
            mRem2 = "F";
        } else {
            mRem2 = mRemainder + "";
        }

        mHexValue = mDiv2 + mRem2;

        return mHexValue;

    }

}
