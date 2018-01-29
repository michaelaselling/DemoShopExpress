package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Popup4 extends AppCompatActivity {

    private static final String LOG_TAG = Popup4.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting warningmessage for not implemented shoopinglist");
        setContentView(R.layout.popup4);
        Log.d(LOG_TAG, "Setting warningmessage done");

    }

    public void onOkClick(View view) {
        Log.d(LOG_TAG, "Ok button has been clicked");

        if (view.getId() == R.id.okButton) {

            Intent i = new Intent(Popup4.this, Inkopslista_3.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on inkopslista_3 again");

        }

    }
}
