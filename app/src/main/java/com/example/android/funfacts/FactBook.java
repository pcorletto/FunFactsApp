package com.example.android.funfacts;

import java.util.Random;

/**
 * Created by hernandez on 11/7/2015.
 */
public class FactBook {

    // Member variables (properties about the object)
    public final String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is actually not in a tree."
    };

    // Methods (abilities: things the object can do)
    public String getFact(){

            String fact="";
            // Randomly select a fact
            Random randomGenerator = new Random();   // Construct a new Random number generator
            int randomNumber = randomGenerator.nextInt(mFacts.length);

            fact = mFacts[randomNumber];

            return fact;

        }

    public String getColor() {

        String color = "#FF";

        // Randomly select a value between 0 - 255 for the R value of our color
        Random randomGeneratorR = new Random();   // Construct a new Random number generator
        int randomNumberR = randomGeneratorR.nextInt(256);
        // Convert the generated hex value to a decimal value
        int divR = randomNumberR / 16;
        String div2R = "";
        int remainderR = randomNumberR % 16;
        String rem2R = "";
        if (divR == 10) {
            div2R = "A";
        } else if (divR == 11) {
            div2R = "B";
        } else if (divR == 12) {
            div2R = "C";
        } else if (divR == 13) {
            div2R = "D";
        } else if (divR == 14) {
            div2R = "E";
        } else if (divR == 15) {
            div2R = "F";
        } else {
            div2R = divR + "";
        }

        if (remainderR == 10) {
            rem2R = "A";
        } else if (remainderR == 11) {
            rem2R = "B";
        } else if (remainderR == 12) {
            rem2R = "C";
        } else if (remainderR == 13) {
            rem2R = "D";
        } else if (remainderR == 14) {
            rem2R = "E";
        } else if (remainderR == 15) {
            rem2R = "F";
        } else {
            rem2R = remainderR + "";
        }

        // Concatenate to the String "0xFF" the hex value of the R value
        color = color + div2R + rem2R;

        // Randomly select a value between 0 - 255 for the G value of our color
        Random randomGeneratorG = new Random();   // Construct a new Random number generator
        int randomNumberG = randomGeneratorG.nextInt(256);
        // Convert the generated hex value to a decimal value
        int divG = randomNumberG / 16;
        String div2G = "";
        int remainderG = randomNumberG % 16;
        String rem2G = "";
        if (divG == 10) {
            div2G = "A";
        } else if (divG == 11) {
            div2G = "B";
        } else if (divG == 12) {
            div2G = "C";
        } else if (divG == 13) {
            div2G = "D";
        } else if (divG == 14) {
            div2G = "E";
        } else if (divG == 15) {
            div2G = "F";
        } else {
            div2G = divG + "";
        }

        if (remainderG == 10) {
            rem2G = "A";
        } else if (remainderG == 11) {
            rem2G = "B";
        } else if (remainderG == 12) {
            rem2G = "C";
        } else if (remainderG == 13) {
            rem2G = "D";
        } else if (remainderG == 14) {
            rem2G = "E";
        } else if (remainderG == 15) {
            rem2G = "F";
        } else {
            rem2G = remainderG + "";
        }

        // Concatenate to the String "0xFF" the hex value of the G value
        color = color + div2G + rem2G;



        // Randomly select a value between 0 - 255 for the B value of our color
        Random randomGeneratorB = new Random();   // Construct a new Random number generator
        int randomNumberB = randomGeneratorB.nextInt(256);
        // Convert the generated hex value to a decimal value
        int divB = randomNumberB / 16;
        String div2B = "";
        int remainderB = randomNumberB % 16;
        String rem2B = "";
        if (divB == 10) {
            div2B = "A";
        } else if (divB == 11) {
            div2B = "B";
        } else if (divB == 12) {
            div2B = "C";
        } else if (divB == 13) {
            div2B = "D";
        } else if (divB == 14) {
            div2B = "E";
        } else if (divB == 15) {
            div2B = "F";
        } else {
            div2B = divB + "";
        }

        if (remainderB == 10) {
            rem2B = "A";
        } else if (remainderB == 11) {
            rem2B = "B";
        } else if (remainderB == 12) {
            rem2B = "C";
        } else if (remainderB == 13) {
            rem2B = "D";
        } else if (remainderB == 14) {
            rem2B = "E";
        } else if (remainderB == 15) {
            rem2B = "F";
        } else {
            rem2B = remainderB + "";
        }

        // Concatenate to the String "0xFF" the hex value of the G value
        color = color + div2B + rem2B;




        return color;


    }
}

