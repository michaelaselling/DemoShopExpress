package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.graphics.Paint.STRIKE_THRU_TEXT_FLAG;
import static com.example.micka.coopshopexpress.R.id.antalVaror;
import static com.example.micka.coopshopexpress.R.id.grey;
import static com.example.micka.coopshopexpress.R.id.listName;
import static com.example.micka.coopshopexpress.R.id.p10;
import static com.example.micka.coopshopexpress.R.id.p11;
import static com.example.micka.coopshopexpress.R.id.p5;
import static com.example.micka.coopshopexpress.R.id.p6;
import static com.example.micka.coopshopexpress.R.id.text;
import static com.example.micka.coopshopexpress.R.id.textView;

public class Handla extends AppCompatActivity {

    private static final String LOG_TAG = Handla.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.handla);
        Log.d(LOG_TAG, "Setting handla done");

        setListName();
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

    public void onExitClick(View view) {
        Log.d(LOG_TAG, "Exit button has been clicked");

        if (view.getId() == R.id.exitButton) {

            Intent i = new Intent(Handla.this, Avbryt.class);
            startActivity(i);

        }

        Varukorg.setAllItemsToNotScanned();

    }

    public void setListName() {

        String ln = Session.getInstance().shoppingList.get(0).getProduct();

       final TextView textView = (TextView) findViewById(listName);
        textView.setText(ln);
    }

    // textView.setPaintFlags(textView.getPaintFlags() | Paint:STRIKE_THRU_TEXT_FLAG);
    // If a product is scanned, set strike-through, we think and hope
// Fixa så att index börjar räkna vid 1 och ökar
    private void fixName(int index) {
        Item item = Session.getInstance().shoppingList.get(index);
        if (!item.isScanned()) {
            return;
        }
        final TextView t1;
        switch(index) {
            case 1:
                t1 = (TextView) findViewById(R.id.p1);
                break;
            case 2:
                t1 = (TextView) findViewById(R.id.p2);
                break;
            case 3:
                t1 = (TextView) findViewById(R.id.p3);
                break;
            case 4:
                t1 = (TextView) findViewById(R.id.p4);
                break;
            case 5:
                t1 = (TextView) findViewById(R.id.p5);
                break;
            case 6:
                t1 = (TextView) findViewById(R.id.p6);
                break;
            case 7:
                t1 = (TextView) findViewById(R.id.p7);
                break;
            case 8:
                t1 = (TextView) findViewById(R.id.p8);
                break;
            case 9:
                t1 = (TextView) findViewById(R.id.p9);
                break;
            case 10:
                t1 = (TextView) findViewById(R.id.p10);
                break;
            case 11:
                t1 = (TextView) findViewById(R.id.p11);
                break;
            case 12:
                t1 = (TextView) findViewById(R.id.p12);
                break;
            default:
                t1 = null; /// Ska inte kunna hända
                // Hade inte kunnnat hända om vi använt en loop i stället :-P
        }
        t1.setPaintFlags(t1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        //return item.isScanned()? "tagen " + item.getProduct() : item.getProduct();
    }

    public void setProductOne () {

        String product1 = Session.getInstance().shoppingList.get(1).getProduct();
        fixName(1);

        if (product1 != null) {
            final TextView t1 = (TextView) findViewById(R.id.p1);
            t1.setText(String.valueOf("- " + product1));

        }

    }

    public void setProductTwo () {

        if (Session.getInstance().shoppingList.size() > 2) {

            String product2 = Session.getInstance().shoppingList.get(2).getProduct();
            fixName(2);
            if (product2 != null) {
                final TextView t2 = (TextView) findViewById(R.id.p2);
                t2.setText(String.valueOf("- " + product2));

            }
        } else {
            final TextView t2 = (TextView) findViewById(R.id.p2);
            t2.setText(String.valueOf(""));

        }

    }

    public void setProductThree () {

        if (Session.getInstance().shoppingList.size() > 3) {

            String product3 = Session.getInstance().shoppingList.get(3).getProduct();
            fixName(3);

            if (product3 != null) {
                final TextView t3 = (TextView) findViewById(R.id.p3);
                t3.setText(String.valueOf("- " + product3));

            }
        } else {
            final TextView t3 = (TextView) findViewById(R.id.p3);
            t3.setText(String.valueOf(""));

        }
    }

    public void setProductFour () {

        if (Session.getInstance().shoppingList.size() > 4) {

            String product4 = Session.getInstance().shoppingList.get(4).getProduct();
            fixName(4);

            if (product4 != null) {
                final TextView t4 = (TextView) findViewById(R.id.p4);
                t4.setText(String.valueOf("- " + product4));
            }
        } else {
            final TextView t4 = (TextView) findViewById(R.id.p4);
            t4.setText(String.valueOf(""));

        }
    }

    public void setProductFive () {

        if (Session.getInstance().shoppingList.size() > 5) {

            String product5 = Session.getInstance().shoppingList.get(5).getProduct();
            fixName(5);

            if (product5 != null) {
                final TextView t5 = (TextView) findViewById(p5);
                t5.setText(String.valueOf("- " + product5));
            }
        } else {
            final TextView t5 = (TextView) findViewById(R.id.p5);
            t5.setText(String.valueOf(""));

        }
    }

    public void setProductSix () {

        if (Session.getInstance().shoppingList.size() > 6) {

            String product6 = Session.getInstance().shoppingList.get(6).getProduct();
            fixName(6);

            if (product6 != null) {
                final TextView t6 = (TextView) findViewById(R.id.p6);
                t6.setText(String.valueOf("- " + product6));
            }
        } else {
            final TextView t6 = (TextView) findViewById(R.id.p6);
            t6.setText(String.valueOf(""));

        }
    }

    public void setProductSeven () {

        if (Session.getInstance().shoppingList.size() > 7) {

            String product7 = Session.getInstance().shoppingList.get(7).getProduct();
            fixName(7);

            if (product7 != null) {
                final TextView t7 = (TextView) findViewById(R.id.p7);
                t7.setText(String.valueOf("- " + product7));
            }
        } else {
            final TextView t7 = (TextView) findViewById(R.id.p7);
            t7.setText(String.valueOf(""));

        }
    }

    public void setProductEight () {

        if (Session.getInstance().shoppingList.size() > 8) {

            String product8 = Session.getInstance().shoppingList.get(8).getProduct();
            fixName(8);

            if (product8 != null) {
                final TextView t8 = (TextView) findViewById(R.id.p8);
                t8.setText(String.valueOf("- " + product8));
            }
        } else {
            final TextView t8 = (TextView) findViewById(R.id.p8);
            t8.setText(String.valueOf(""));

        }
    }

    public void setProductNine () {

        if (Session.getInstance().shoppingList.size() > 9) {

            String product9 = Session.getInstance().shoppingList.get(9).getProduct();
            fixName(9);

            if (product9 != null) {
                final TextView t9 = (TextView) findViewById(R.id.p9);
                t9.setText(String.valueOf("- " + product9));
            }
        } else {
            final TextView t9 = (TextView) findViewById(R.id.p9);
            t9.setText(String.valueOf(""));

        }
    }

    public void setProductTen () {

        if (Session.getInstance().shoppingList.size() > 10) {

            String product10 = Session.getInstance().shoppingList.get(10).getProduct();
            fixName(10);

            if (product10 != null) {
                final TextView t10 = (TextView) findViewById(R.id.p10);
                t10.setText(String.valueOf("- " + product10));
            }
        } else {
            final TextView t10 = (TextView) findViewById(R.id.p10);
            t10.setText(String.valueOf(""));

        }
    }

    public void setProductEleven () {

        if (Session.getInstance().shoppingList.size() > 11) {

            String product11 = Session.getInstance().shoppingList.get(11).getProduct();
            fixName(11);

            if (product11 != null) {
                final TextView t11 = (TextView) findViewById(R.id.p11);
                t11.setText(String.valueOf("- " + product11));
            }
        } else {
            final TextView t11 = (TextView) findViewById(R.id.p11);
            t11.setText(String.valueOf(""));

        }
    }

    public void setProductTwelve () {

        if (Session.getInstance().shoppingList.size() > 12) {

            String product12 = Session.getInstance().shoppingList.get(12).getProduct();
            fixName(12);

            if (product12 != null) {
                final TextView t12 = (TextView) findViewById(R.id.p12);
                t12.setText(String.valueOf("- " + product12));
            }
        } else {
            final TextView t12 = (TextView) findViewById(R.id.p12);
            t12.setText(String.valueOf(""));

        }
    }

    public void onSkannaVaraClick (View view) {

        if (view.getId() == R.id.skanna) {

            Intent i = new Intent(Handla.this, Skanna.class);
            startActivity(i);

        }
    }

    public void onCheckProductsClick(View view) {

        if (view.getId() == R.id.checkProducts) {

            Intent i = new Intent(Handla.this, Varukorg.class);
            startActivity(i);

        }
    }
}
