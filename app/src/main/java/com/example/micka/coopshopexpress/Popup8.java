package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Popup8 extends AppCompatActivity {

    private static final String LOG_TAG = Popup8.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting warningmessage for no list name");
        setContentView(R.layout.popup8);
        Log.d(LOG_TAG, "Setting warningmessage done");

    }

    public void onOkClick(View view) {
        Log.d(LOG_TAG, "Ok button has been clicked");

        if (view.getId() == R.id.okButton) {

            Intent i = new Intent(Popup8.this, skapaLista.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on stohandla again");

        }

    }
}
