package edu.orangecoastcollege.cs273.tmorrissey1.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Controller for button that displays a toast when clicked
 */
public class MainActivity extends AppCompatActivity {

    private Button speakButton;

    private Context context = this;

    /**
     * Main method
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflating opening the layout called activity_main
        setContentView(R.layout.activity_main);

        // hook up  the speakButton to the one in our view
        speakButton = (Button) findViewById(R.id.speakButton);

        // wire up speakButton to perform an onClick event
        speakButton.setOnClickListener(new View.OnClickListener() {
            /**
             * Makes a toast message
             * @param view button that was clicked
             */
            @Override
            public void onClick(View view) {
                // Use the static reference to toast to display the message
                // Toast vanishes after a set amount of time.
                // Dialog requires user input
                Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();

            }
        });



    }
}
