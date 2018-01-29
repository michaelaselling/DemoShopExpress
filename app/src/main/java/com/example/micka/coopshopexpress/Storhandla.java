package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Storhandla extends AppCompatActivity {

    private static final String LOG_TAG = Storhandla.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting storhandla layout");
        setContentView(R.layout.storhandla);
        Log.d(LOG_TAG, "Setting storhandla layout done");

    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(Storhandla.this, Shoppinglistor.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on shoppinglistor again");

        }

    }

    public void onShareClick(View view) {
        Log.d(LOG_TAG, "Share button has been clicked");

        if(view.getId() == R.id.share) {

            Intent i = new Intent(Storhandla.this, Popup1.class);
            startActivity(i);

            Log.d(LOG_TAG, "Warning! Function is not available");

        }

    }

    public void onEditClick(View view) {
        Log.d(LOG_TAG, "Share button has been clicked");

        if(view.getId() == R.id.edit) {

            Intent i = new Intent(Storhandla.this, Popup1.class);
            startActivity(i);

            Log.d(LOG_TAG, "Warning! Function is not available");

        }

    }

    public void onShoppingClick(View view) {
        Log.d(LOG_TAG, "Share button has been clicked");

        if(view.getId() == R.id.shoppingButton) {

            Intent i = new Intent(Storhandla.this, Popup6.class);
            startActivity(i);

            Log.d(LOG_TAG, "Warning! Shoppinglist is not implemented");

        }

    }

}
