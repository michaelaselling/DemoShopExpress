package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.micka.coopshopexpress.R.id.editText;
import static com.example.micka.coopshopexpress.R.layout.handla;

public class Skanna extends AppCompatActivity {

    private static final String LOG_TAG = Skanna.class.getName();

    String bröd = "0001";
    String mjölk = "0002";
    String ägg = "0003";
    String smör = "0004";
    String grädde = "0005";
    String yoghurt = "0006";
    String flingor = "0007";
    String ost = "0008";
    String kaffe = "0009";
    String juice = "0010";
    String baguette = "0011";
    String jordgubbar = "0012";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting skanna layout");
        setContentView(R.layout.skanna);
        Log.d(LOG_TAG, "Setting skanna done");

    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(Skanna.this, Handla.class);
            startActivity(i);

        }
    }

    public void onSkannaVaraClick (View view) {
        Log.d(LOG_TAG, "Skanna button has been clicked");

        if (view.getId() == R.id.skanna) {

            EditText code = (EditText) findViewById(R.id.streckkod);

            boolean c1 = checkCode(code);
            Item c2 = checkProductInList(code);

            if (c1 == true) {

                Intent i = new Intent(Skanna.this, Popup10.class);
                startActivity(i);

            } else if (c2 == null) {

                Intent i = new Intent(Skanna.this, Popup11.class);
                startActivity(i);

            } else {
                c2.setScanned(true);
               //String product1 = c2.getProduct();
// Få tillgång till textviews i Handla klass för att stryka vara

               // Log.d(LOG_TAG, "Detta är produkten för streckkoden: " + product1);

                Intent i = new Intent(Skanna.this, Handla.class);
                startActivity(i);

            }

        }

    }

    private boolean checkCode (EditText editText) {

        if (editText.getText().toString().isEmpty()) {

            return true;
        }
        return false;
    }

    public Item checkProductInList (EditText editText) {

        for (int i = 1; i < Session.getInstance().shoppingList.size(); i++) {

            String id = Session.getInstance().shoppingList.get(i).getId();
            String name = editText.getText().toString();

            if (id.equals(name)) {
                Log.d(LOG_TAG, "Streckkoden är giltig" + editText.getText());

                return Session.getInstance().shoppingList.get(i);
            }

        }
        return null;
    }

}

// Bröd = 0001
// Mjölk = 0002
// Ägg = 0003
// Smör = 0004
// Grädde = 0005
// Yoghurt = 0006
// Flingor = 0007
// Ost = 0008
// Kaffe = 0009
// Juice = 0011
// Baguette = 0012
// Jordgubbar = 0013