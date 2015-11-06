package com.example.android.funfacts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign them the Views from the layout file.
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // The button was clicked, so update the fact label with a new label
            String fact="";
            // Randomly select a fact
            Random randomGenerator = new Random();   // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(3);

                // We'll make our app only have 3 random facts

                /* Convert our random number to a text fact

                *0 = Ants stretch when they wake up in the morning
                *1 = Ostriches can run faster than horses
                *2 = Olympic gold medals are actually made mostly of silver

                */

                // If randomNumber = 0
                if(randomNumber == 0){
                    // set fact = ants fact
                    fact = "Ants stretch when they wake up in the morning";
                }

                // Else If randomNumber = 1
                else if(randomNumber == 1){
                    // set fact = ostriches fact
                    fact = "Ostriches can run faster than horses";
                }

                // If randomNumber = 2
                else if(randomNumber == 2){
                    // set fact = olympic medal fact
                    fact = "Olympic gold medals are actually made mostly of silver";
                }

                else {
                    fact = "Sorry, there was an error";
                }

            // Update the label with our dynamic fact
            factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
