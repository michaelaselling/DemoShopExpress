package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;

public class Shoppinglistor extends AppCompatActivity {

    private static final String LOG_TAG = Shoppinglistor.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting shoppinglistor layout");
        setContentView(R.layout.shoppinglistor);
        Log.d(LOG_TAG, "Setting shoppinglistor layout done");

        checkListName();

    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(Shoppinglistor.this, MainActivity.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on front page again");

        }

    }

    public void onStorhandlaClick(View view) {
        Log.d(LOG_TAG, "Storhandla has been clicked");

        if (view.getId() == R.id.textView5) {

            Intent i = new Intent(Shoppinglistor.this, Storhandla.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are now on storhandla");

        }

    }

    public void onTacomysClick(View view) {
        Log.d(LOG_TAG, "Storhandla has been clicked");

        if (view.getId() == R.id.textView8) {

            Intent i = new Intent(Shoppinglistor.this, Tacomys.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are now on storhandla");

        }

    }

    public void onInkopClick(View view) {
        Log.d(LOG_TAG, "Inköpslista_1 has been clicked");

        if (view.getId() == R.id.textView9) {

            Intent i = new Intent(Shoppinglistor.this, Inkopslista_3.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are now on inköpslista_1");

        }

    }

   public void checkListName() {


       if (Session.getInstance().shoppingList != null) {

           Item i = Session.getInstance().shoppingList.get(0);

           String name = i.getProduct();

           TextView list = (TextView) findViewById(R.id.nyLista);
           list.setText(name);
           TextView background = (TextView) findViewById(R.id.bakgrundg);
           background.setBackgroundColor(Color.parseColor("#e6ffe6"));

       } else {

           TextView list = (TextView) findViewById(R.id.nyLista);
           list.setText("");

       }
   }

    public void onCreateListClick (View view) {

        Log.d(LOG_TAG, "Create list has been clicked");

        if (view.getId() == R.id.createButton) {

            Intent i = new Intent(Shoppinglistor.this, skapaLista.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are now on creating list");

        }
    }

    public void onNoListClick (View view) {

        Log.d(LOG_TAG, "Create list has been clicked");

        if (view.getId() == R.id.noListButton) {

            Intent i = new Intent(Shoppinglistor.this, Varukorg2.class);
            startActivity(i);

        }
    }

    public void onNewListClick (View view) {

        Log.d(LOG_TAG, "Create list has been clicked");

        if (view.getId() == R.id.nyLista) {

            Intent i = new Intent(Shoppinglistor.this, Minlista.class);
            startActivity(i);

        }
    }
}
