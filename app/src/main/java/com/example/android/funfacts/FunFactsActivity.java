package com.example.android.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign them the Views from the layout file.
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout screen = (RelativeLayout) findViewById(R.id.screen);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String fact = mFactBook.getFact();
            String color = mFactBook.getColor();

            // Update the label with our dynamic fact
            factLabel.setText(fact);

            //Dynamically change the background color
            int color2 = Color.parseColor(color);

            screen.setBackgroundColor(color2);

            }
        };
        showFactButton.setOnClickListener(listener);

        // This is how we make and show a Toast message in just one line.
        Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();

    }

}
