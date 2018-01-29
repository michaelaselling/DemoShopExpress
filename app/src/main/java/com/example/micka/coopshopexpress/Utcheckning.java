package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Utcheckning extends AppCompatActivity {

    private static final String LOG_TAG = Utcheckning.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.utcheckning);
        Log.d(LOG_TAG, "Setting handla done");

    }

    public void onSkannaClick (View view) {
        Log.d(LOG_TAG, "Betala button has been clicked");

        if (view.getId() == R.id.skannaButton) {

            Intent i = new Intent(Utcheckning.this, Kvitto.class);
            startActivity(i);

        }

    }

}
