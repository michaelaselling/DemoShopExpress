package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Utcheckning2 extends AppCompatActivity {

    private static final String LOG_TAG = Utcheckning2.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.utcheckning2);
        Log.d(LOG_TAG, "Setting handla done");

    }

    public void onSkannaClick (View view) {
        Log.d(LOG_TAG, "Betala button has been clicked");

        if (view.getId() == R.id.skannaButton) {

            Intent i = new Intent(Utcheckning2.this, Kvitto2.class);
            startActivity(i);

        }

    }
}
