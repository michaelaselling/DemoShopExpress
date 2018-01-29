package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Avbryt extends AppCompatActivity {

    private static final String LOG_TAG = Handla.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting exit layout");
        setContentView(R.layout.avbryt);
        Log.d(LOG_TAG, "Setting layout done");
    }

    public void onYesClick(View view) {
        Log.d(LOG_TAG, "Yes button has been clicked");

        if (view.getId() == R.id.yesButton) {

            Intent i = new Intent(Avbryt.this, MainActivity.class);
            startActivity(i);

        }

    }

    public void onRegretClick(View view) {
        Log.d(LOG_TAG, "Regret button has been clicked");

        if (view.getId() == R.id.regretButton) {

            Intent i = new Intent(Avbryt.this, Handla.class);
            startActivity(i);

        }

    }
}
