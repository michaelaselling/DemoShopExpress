package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.R.attr.name;
import static android.media.CamcorderProfile.get;
import static com.example.micka.coopshopexpress.R.id.edit;
import static com.example.micka.coopshopexpress.R.id.jordgubbar;
import static com.example.micka.coopshopexpress.R.id.mjölk;

public class Skanna2 extends AppCompatActivity {

    private static final String LOG_TAG = Skanna.class.getName();

    private static boolean ogiltig = false;

    public static List<Item> varukorg = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting skanna layout");
        setContentView(R.layout.skanna2);
        Log.d(LOG_TAG, "Setting skanna done");

    }

    public static void clearList () {

        varukorg.clear();
    }

    public static boolean checkList () {

        return varukorg.isEmpty();

    }

    public void checkProducts(EditText editText) {

        String name = editText.getText().toString();

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

        if (name.equals(bröd)) {

            varukorg.add(new Item("Bröd", "0001", 19.95, true));

           // return ogiltig = false;
        }

        if (name.equals(mjölk)) {

            varukorg.add(new Item("Mjölk", "0002", 9.10, true));

           // return ogiltig = false;
        }

        if (name.equals(ägg)) {

            varukorg.add(new Item("Ägg", "0003", 14.50, true));

          //  return ogiltig = false;
        }

        if (name.equals(smör)) {

            varukorg.add(new Item ("Smör", "0004", 33.95, true));

           // return ogiltig = false;
        }

        if (name.equals(grädde)) {

            varukorg.add(new Item("Grädde", "0005", 18.50, true));

          //  return ogiltig = false;
        }

        if (name.equals(yoghurt)) {

            varukorg.add(new Item("Yoghurt", "0006", 14.15, true));

          //  return ogiltig = false;
        }

        if (name.equals(flingor)) {

            varukorg.add(new Item("Flingor", "0007", 21.50, true));

          //  return ogiltig = false;
        }

        if (name.equals(ost)) {

            varukorg.add(new Item("Ost","0008", 49.50, true));

           // return ogiltig = false;

        }

        if (name.equals(kaffe)) {

            varukorg.add(new Item("Kaffe", "0009", 39.95, true));

         //   return ogiltig = false;
        }

        if (name.equals(juice)) {

            varukorg.add(new Item("Juice", "0010", 18.95, true));

         //   return ogiltig = false;

        }

        if (name.equals(baguette)) {

            varukorg.add(new Item("Baguette", "0011", 14.90, true));

          //  return ogiltig = false;

        }

        if (name.equals(jordgubbar)) {

            varukorg.add(new Item("Jordgubbar", "0012", 26.95, true));

          //  return ogiltig = false;

        }

        Session.getInstance().varukorg = varukorg;
        for (Item item:  Session.getInstance().varukorg) {
            Log.d(LOG_TAG, " storing item: " + item);
            Session.getInstance().store.storeItem(item);
        }

    }


    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(Skanna2.this, Varukorg2.class);
            startActivity(i);

        }
    }

    public void onSkannaVaraClick(View view) {
        Log.d(LOG_TAG, "Skanna button has been clicked");

        if (view.getId() == R.id.skanna) {

            EditText code = (EditText) findViewById(R.id.streckkod);

            boolean c1 = checkCode(code);
            checkProducts(code);
            Item c2 = checkEan(code);

            if (c1) {

                Intent i = new Intent(Skanna2.this, Popup15.class);
                startActivity(i);

            } else if (c2 == null) {

                Intent i = new Intent(Skanna2.this, Popup16.class);
                startActivity(i);

            } else {
                Intent i = new Intent(Skanna2.this, Varukorg2.class);
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

    private Item checkEan (EditText editText) {

        for (int i = 0; i < Session.getInstance().varukorg.size(); i++) {

            String id = Session.getInstance().varukorg.get(i).getId();
            Log.d(LOG_TAG, Session.getInstance().varukorg.toString() + " din vara");

            if (id.equals(editText.getText().toString())) {
                Log.d(LOG_TAG, "Streckkoden är giltig" + editText.getText().toString());

                return Session.getInstance().varukorg.get(i);
            }

        }

        return null;
    }
}
