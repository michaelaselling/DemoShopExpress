package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Betala extends AppCompatActivity {

    private static final String LOG_TAG = Betala.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.betala);
        Log.d(LOG_TAG, "Setting handla done");

    }

    public void onExitClick(View view) {
        Log.d(LOG_TAG, "Exit button has been clicked");

        if (view.getId() == R.id.exitButton) {

            Intent i = new Intent(Betala.this, Avbryt.class);
            startActivity(i);

        }
    }

    public void onContinueClick(View view) {
        Log.d(LOG_TAG, "Continue button has been clicked");

        if (view.getId() == R.id.continueButton) {

            Intent i = new Intent(Betala.this, Utcheckning.class);
            startActivity(i);

        }
    }

}
