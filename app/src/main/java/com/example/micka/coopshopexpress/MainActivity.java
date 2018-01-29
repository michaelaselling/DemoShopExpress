package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static com.example.micka.coopshopexpress.R.layout.bankid;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting main activity layout");
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "Setting main activity layout done");

        Session.getInstance().store = new DBItemStore(this);
        try {
            Session.getInstance().store.open();
        } catch (ItemStoreException e) {
            Log.d(LOG_TAG, "Can't open ItemStore....");
            finish();
        }

        for (Item i : Session.getInstance().store.getAllItems()) {
            Log.d(LOG_TAG, " * from db: " + i );
        }

    }

    public void onTextViewClick(View view) {
        Log.d(LOG_TAG, "TextView has been clicked");

        if (view.getId() == R.id.butikTextView) {

            Intent i = new Intent (MainActivity.this, Bankid.class);
            startActivity(i);

            Log.d(LOG_TAG, "Bankid activity has started");

        }

    }

}
