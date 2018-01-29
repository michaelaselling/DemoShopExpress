package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Popup14 extends AppCompatActivity {

    private static final String LOG_TAG = Popup14.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting warning scanning layout");
        setContentView(R.layout.popup14);
        Log.d(LOG_TAG, "Setting layout done");

    }

    public void onOkClick(View view) {
        Log.d(LOG_TAG, "Ok button has been clicked");

        if (view.getId() == R.id.okButton) {

            Intent i = new Intent(Popup14.this, Minlista.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on my list again");

        }

    }
}
