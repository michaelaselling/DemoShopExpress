package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class End extends AppCompatActivity {

    private static final String LOG_TAG = Kvitto.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.end);
        Log.d(LOG_TAG, "Setting handla done");

    }

    public void onAvslutaClick (View view) {
        Log.d(LOG_TAG, "Skanna button has been clicked");

        if (view.getId() == R.id.skannaButton) {

            Intent i = new Intent(End.this, MainActivity.class);
            startActivity(i);

        }

    }
}
