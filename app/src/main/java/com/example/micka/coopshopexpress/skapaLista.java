package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.micka.coopshopexpress.R.id.baguette;
import static com.example.micka.coopshopexpress.R.id.bröd;
import static com.example.micka.coopshopexpress.R.id.flingor;
import static com.example.micka.coopshopexpress.R.id.grädde;
import static com.example.micka.coopshopexpress.R.id.jordgubbar;
import static com.example.micka.coopshopexpress.R.id.juice;
import static com.example.micka.coopshopexpress.R.id.kaffe;
import static com.example.micka.coopshopexpress.R.id.mjölk;
import static com.example.micka.coopshopexpress.R.id.ost;
import static com.example.micka.coopshopexpress.R.id.smör;
import static com.example.micka.coopshopexpress.R.id.yoghurt;
import static com.example.micka.coopshopexpress.R.id.ägg;

public class skapaLista extends AppCompatActivity {

    private static final String LOG_TAG = skapaLista.class.getName();

    private int countProducts=0;
    private boolean bröd1=false;
    private boolean mjölk1=false;
    private boolean ägg1=false;
    private boolean smör1=false;
    private boolean grädde1=false;
    private boolean yoghurt1=false;
    private boolean flingor1=false;
    private boolean ost1=false;
    private boolean kaffe1=false;
    private boolean juice1=false;
    private boolean baguette1=false;
    private boolean jordgubbar1=false;

    public boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting shoppinglistor layout");
        setContentView(R.layout.skapalista);
        Log.d(LOG_TAG, "Setting shoppinglistor layout done");

    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(skapaLista.this, Shoppinglistor.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on front page again");

        }

    }

    public void onCheckClickBröd (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case bröd:
                if (checked) {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    bröd1=true;

                } else {
                final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                antalVaror.setText(String.valueOf(countProducts-1));
                countProducts--;

                bröd1=false;

                    Log.d(LOG_TAG, "brödet är: " + bröd1);
            }
        }
    }

    public void onCheckClickMjölk (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case mjölk:
                if (checked)  {
                final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    mjölk1=true;
            } else {
                final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                antalVaror.setText(String.valueOf(countProducts-1));

                countProducts--;

                mjölk1=false;
            }

        }

    }

    public void onCheckClickÄgg (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case ägg:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    ägg1=true;

                } else {
                final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                antalVaror.setText(String.valueOf(countProducts-1));

                countProducts--;

                ägg1=false;
            }

        }
    }

    public void onCheckClickSmör (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case smör:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    smör1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    smör1=false;
                }

        }
    }

    public void onCheckClickGrädde (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case grädde:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    grädde1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    grädde1=false;
                }

        }
    }

    public void onCheckClickYoghurt (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case yoghurt:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    yoghurt1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    yoghurt1=false;
                }

        }
    }

    public void onCheckClickFlingor (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case flingor:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    flingor1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    flingor1=false;
                }

        }
    }

    public void onCheckClickOst (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case ost:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    ost1=true;
                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    ost1=false;
                }

        }
    }

    public void onCheckClickKaffe (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case kaffe:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    kaffe1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    kaffe1=false;
                }

        }
    }

    public void onCheckClickJuice (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case juice:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    juice1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    juice1=false;
                }

        }
    }

    public void onCheckClickBaguette (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case baguette:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    baguette1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    baguette1=false;
                }

        }
    }

    public void onCheckClickJordgubbar (View view) {

        checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case jordgubbar:
                if (checked)  {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts+1));

                    countProducts++;

                    jordgubbar1=true;

                } else {
                    final TextView antalVaror = (TextView) findViewById(R.id.antalVaror);
                    antalVaror.setText(String.valueOf(countProducts-1));

                    countProducts--;

                    jordgubbar1=false;
                }

        }
    }

    public void onShoppingClick (View view) {

        Log.d(LOG_TAG, "Create list has been clicked");

        if (view.getId() == R.id.shoppingButton) {

            EditText listName = (EditText) findViewById(R.id.listName);

            boolean name = checkListName(listName);

            boolean products = checkProducts();

                if (name == true){

                    Intent i = new Intent(skapaLista.this, Popup7.class);
                    startActivity(i);

                    Log.d(LOG_TAG, "Warning! No listname given");

                } else if (products == true) {

                Intent i = new Intent(skapaLista.this, Popup8.class);
                startActivity(i);

                Log.d(LOG_TAG, "You are back on shoppinglists again");

                 } else {

                    createList();

                    Intent i = new Intent(skapaLista.this, Minlista.class);
                    startActivity(i);

                   for (Item item : Session.getInstance().shoppingList) {
                      Log.d(LOG_TAG, "Detta är din skapade shoppinglita: " + item.getProduct());
                    }
                }
        }
    }

    private boolean checkListName (EditText editText) {

        if (editText.getText().toString().trim().length() > 0) {

            return false;
        }
        return true;
    }

    private boolean checkProducts() {

        if (bröd1==false && mjölk1==false && ägg1==false && smör1==false && grädde1==false && yoghurt1==false && flingor1==false && ost1==false && kaffe1==false && juice1==false && baguette1==false && jordgubbar1==false) {

            return true;
        }
        return false;
    }

    public void createList () {

        List<Item> shoppingList = new ArrayList<>();

        EditText listName = (EditText) findViewById(R.id.listName);

        String name = listName.getText().toString();

      shoppingList.add(new Item(name, "0000",0));

        if(bröd1==true) {

            shoppingList.add(new Item("Bröd", "0001", 19.95));

        }
        if (mjölk1==true) {

            shoppingList.add(new Item("Mjölk", "0002", 9.10));

        }
        if (ägg1==true) {

            shoppingList.add(new Item("Ägg", "0003", 14.50));
        }
        if (smör1==true) {

            shoppingList.add(new Item ("Smör", "0004", 33.95));

        }
        if (grädde1==true) {

            shoppingList.add(new Item("Grädde", "0005", 18.50));

        }
        if (yoghurt1==true) {

            shoppingList.add(new Item("Yoghurt", "0006", 14.15));

        }
        if (flingor1==true) {

            shoppingList.add(new Item("Flingor", "0007", 21.50));

        }
        if (ost1==true) {

            shoppingList.add(new Item("Ost","0008", 49.50));

        }
        if (kaffe1==true) {

            shoppingList.add(new Item("Kaffe", "0009", 39.95));

        }
        if (juice1==true) {

            shoppingList.add(new Item("Juice", "0010", 18.95));
        }
        if (baguette1==true) {

            shoppingList.add(new Item("Baguette", "0011", 14.90));
        }
        if (jordgubbar1==true) {

            shoppingList.add(new Item("Jordgubbar", "0012", 26.95));
        }

       Session.getInstance().shoppingList = shoppingList;
        for (Item item:  Session.getInstance().shoppingList) {
                Log.d(LOG_TAG, " storing item: " + item);
                Session.getInstance().store.storeItem(item);
        }
    }

}


/*

  bygg upp lista av strängar goLista , spara i
SSession.getInstance().shoppingList = goLista;
 */