package com.example.micka.coopshopexpress;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Popup18 extends AppCompatActivity {

    private static final String LOG_TAG = Popup18.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting warningmessage for share");
        setContentView(R.layout.popup18);
        Log.d(LOG_TAG, "Setting warningmessage for share done");

    }

    public void onOkClick(View view) {
        Log.d(LOG_TAG, "Ok button has been clicked");

        if (view.getId() == R.id.okButton) {

            Intent i = new Intent(Popup18.this, Varukorg2.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on inkopslista_1 again");

        }

    }
}
