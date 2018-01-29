package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.name;
import static com.example.micka.coopshopexpress.R.id.antalVaror;
import static com.example.micka.coopshopexpress.R.id.id1;
import static com.example.micka.coopshopexpress.R.id.id2;
import static com.example.micka.coopshopexpress.R.id.id3;
import static com.example.micka.coopshopexpress.R.id.listName;

public class Minlista extends AppCompatActivity {

    private static final String LOG_TAG = Minlista.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting your list layout");
        setContentView(R.layout.minlista);
        Log.d(LOG_TAG, "Setting layout done");

        setShoppingListName();
        setProductOne();
        setProductTwo();
        setProductThree();
        setProductFour();
        setProductFive();
        setProductSix();
        setProductSeven();
        setProductEight();
        setProductNine();
        setProductTen();
        setProductEleven();
        setProductTwelve();
    }

    public void onBackClick(View view) {
        Log.d(LOG_TAG, "Back button has been clicked");

        if (view.getId() == R.id.backButton) {

            Intent i = new Intent(Minlista.this, Shoppinglistor.class);
            startActivity(i);

            Log.d(LOG_TAG, "You are back on shoppinglistor again");

        }

    }

    public void onShoppingClick (View view) {

        if(view.getId() == R.id.shoppingButton) {

            Intent i = new Intent(Minlista.this, Handla.class);
            startActivity(i);

        }
    }

    public void onShareClick(View view) {
        Log.d(LOG_TAG, "Share button has been clicked");

        if(view.getId() == R.id.share) {

            Intent i = new Intent(Minlista.this, Popup17.class);
            startActivity(i);

            Log.d(LOG_TAG, "Warning! Function is not available");

        }

    }

    public void setShoppingListName() {

       String name = Session.getInstance().shoppingList.get(0).getProduct();

        final TextView listName = (TextView) findViewById(R.id.listName);
        listName.setText(String.valueOf(name));

    }

    public void onEditClick(View view) {

        if(view.getId() == R.id.edit) {

            Intent i = new Intent(Minlista.this, Popup14.class);
            startActivity(i);

        }

    }

    public void setProductOne () {

        String product1 = Session.getInstance().shoppingList.get(1).getProduct();
        Log.d(LOG_TAG, "Första varan: " + product1);

        if (product1 != null) {
            final TextView p1 = (TextView) findViewById(R.id.id1);
            p1.setText(String.valueOf("- " + product1));
        }
    }

    public void setProductTwo () {

        if (Session.getInstance().shoppingList.size() > 2) {

            String product2 = Session.getInstance().shoppingList.get(2).getProduct();
            Log.d(LOG_TAG, "Andra varan: " + product2);

            if (product2 != null) {
                final TextView p2 = (TextView) findViewById(R.id.id2);
                p2.setText(String.valueOf("- " + product2));
            }
        } else {
            final TextView p2 = (TextView) findViewById(R.id.id2);
            p2.setText(String.valueOf(""));

        }


    }

    public void setProductThree () {

        if (Session.getInstance().shoppingList.size() > 3) {

            String product3 = Session.getInstance().shoppingList.get(3).getProduct();
            Log.d(LOG_TAG, "Tredje varan: " + product3);

            if (product3 != null) {
                final TextView p3 = (TextView) findViewById(R.id.id3);
                p3.setText(String.valueOf("- " + product3));
            }
        } else {
            final TextView p3 = (TextView) findViewById(R.id.id3);
            p3.setText(String.valueOf(""));

        }
    }

    public void setProductFour () {

        if (Session.getInstance().shoppingList.size() > 4) {

            String product4 = Session.getInstance().shoppingList.get(4).getProduct();
            Log.d(LOG_TAG, "Fjärde varan: " + product4);

            if (product4 != null) {
                final TextView p4 = (TextView) findViewById(R.id.id4);
                p4.setText(String.valueOf("- " + product4));
            }
        } else {
            final TextView p4 = (TextView) findViewById(R.id.id4);
            p4.setText(String.valueOf(""));

        }
    }

    public void setProductFive () {

        if (Session.getInstance().shoppingList.size() > 5) {

            String product5 = Session.getInstance().shoppingList.get(5).getProduct();
            Log.d(LOG_TAG, "Femte varan: " + product5);

            if (product5 != null) {
                final TextView p5 = (TextView) findViewById(R.id.id5);
                p5.setText(String.valueOf("- " + product5));
            }
        } else {
            final TextView p5 = (TextView) findViewById(R.id.id5);
            p5.setText(String.valueOf(""));

        }
    }

    public void setProductSix () {

        if (Session.getInstance().shoppingList.size() > 6) {

            String product6 = Session.getInstance().shoppingList.get(6).getProduct();
            Log.d(LOG_TAG, "Sjätte varan: " + product6);

            if (product6 != null) {
                final TextView p6 = (TextView) findViewById(R.id.id6);
                p6.setText(String.valueOf("- " + product6));
            }
        } else {
            final TextView p6 = (TextView) findViewById(R.id.id6);
            p6.setText(String.valueOf(""));

        }
    }

    public void setProductSeven () {

        if (Session.getInstance().shoppingList.size() > 7) {

            String product7 = Session.getInstance().shoppingList.get(7).getProduct();
            Log.d(LOG_TAG, "Sjätte varan: " + product7);

            if (product7 != null) {
                final TextView p7 = (TextView) findViewById(R.id.id7);
                p7.setText(String.valueOf("- " + product7));
            }
        } else {
            final TextView p7 = (TextView) findViewById(R.id.id7);
            p7.setText(String.valueOf(""));

        }
    }

    public void setProductEight () {

        if (Session.getInstance().shoppingList.size() > 8) {

            String product8 = Session.getInstance().shoppingList.get(8).getProduct();
            Log.d(LOG_TAG, "Åttonde varan: " + product8);

            if (product8 != null) {
                final TextView p8 = (TextView) findViewById(R.id.id8);
                p8.setText(String.valueOf("- " + product8));
            }
        } else {
            final TextView p8 = (TextView) findViewById(R.id.id8);
            p8.setText(String.valueOf(""));

        }
    }

    public void setProductNine () {

        if (Session.getInstance().shoppingList.size() > 9) {

            String product9 = Session.getInstance().shoppingList.get(9).getProduct();
            Log.d(LOG_TAG, "Nionde varan: " + product9);

            if (product9 != null) {
                final TextView p9 = (TextView) findViewById(R.id.id9);
                p9.setText(String.valueOf("- " + product9));
            }
        } else {
            final TextView p9 = (TextView) findViewById(R.id.id9);
            p9.setText(String.valueOf(""));

        }
    }

    public void setProductTen () {

        if (Session.getInstance().shoppingList.size() > 10) {

            String product10 = Session.getInstance().shoppingList.get(10).getProduct();
            Log.d(LOG_TAG, "Tioende varan: " + product10);

            if (product10 != null) {
                final TextView p10 = (TextView) findViewById(R.id.id10);
                p10.setText(String.valueOf("- " + product10));
            }
        } else {
            final TextView p10 = (TextView) findViewById(R.id.id10);
            p10.setText(String.valueOf(""));

        }
    }

    public void setProductEleven () {

        if (Session.getInstance().shoppingList.size() > 11) {

            String product11 = Session.getInstance().shoppingList.get(11).getProduct();
            Log.d(LOG_TAG, "Elfte varan: " + product11);

            if (product11 != null) {
                final TextView p11 = (TextView) findViewById(R.id.id11);
                p11.setText(String.valueOf("- " + product11));
            }
        } else {
            final TextView p11 = (TextView) findViewById(R.id.id11);
            p11.setText(String.valueOf(""));

        }
    }

    public void setProductTwelve () {

        if (Session.getInstance().shoppingList.size() > 12) {

            String product12 = Session.getInstance().shoppingList.get(12).getProduct();
            Log.d(LOG_TAG, "Tolfte varan: " + product12);

            if (product12 != null) {
                final TextView p12 = (TextView) findViewById(R.id.id12);
                p12.setText(String.valueOf("- " + product12));
            }
        } else {
            final TextView p12 = (TextView) findViewById(R.id.id12);
            p12.setText(String.valueOf(""));

        }
    }

}
