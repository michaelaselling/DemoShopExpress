package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.os.Build.VERSION_CODES.M;

public class Bankid extends AppCompatActivity {

    private static final String LOG_TAG = Bankid.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting bankid layout");
        setContentView(R.layout.bankid);
        Log.d(LOG_TAG, "Setting bankdid layout done");

    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent (Bankid.this, MainActivity.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on front page again");

        }

    }

    public void onLoginClick(View view) {
        Log.d(LOG_TAG, "Log in button has been clicked");

        if (view.getId() == R.id.loginButton) {

            Intent i = new Intent (Bankid.this, Shoppinglistor.class);
            startActivity(i);

            Log.d(LOG_TAG, "Log in was successful");

        }

    }

}
