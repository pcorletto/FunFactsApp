package com.example.android.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends ActionBarActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private static final String KEY_FACT = "KEY_FACT" ;
    private static final String KEY_COLOR = "KEY_COLOR";

    private FactBook mFactBook = new FactBook();
    private String mFact = mFactBook.mFacts[0];
    private int mColor = Color.parseColor("#51b46d");

    private TextView factLabel;
    private Button showFactButton;
    private RelativeLayout screen;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mFact = savedInstanceState.getString(KEY_FACT);
        mColor = savedInstanceState.getInt(KEY_COLOR);
        factLabel.setText(mFact);
        showFactButton.setTextColor(mColor);
        screen.setBackgroundColor(mColor);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign them the Views from the layout file.
        factLabel = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        screen = (RelativeLayout) findViewById(R.id.screen);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            mFact = mFactBook.getFact();
            String color = mFactBook.getColor();

            // Update the label with our dynamic fact
            factLabel.setText(mFact);

            //Dynamically change the background color
            mColor = Color.parseColor(color);

                screen.setBackgroundColor(mColor);
                showFactButton.setTextColor(mColor);

            }
        };
        showFactButton.setOnClickListener(listener);

        // This is how we make and show a Toast message in just one line.
        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }

}
