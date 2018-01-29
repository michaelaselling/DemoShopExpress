package com.example.micka.coopshopexpress;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.test.suitebuilder.TestMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.os.Build.VERSION_CODES.M;
import static com.example.micka.coopshopexpress.R.id.listName;
import static com.example.micka.coopshopexpress.R.id.p1;
import static com.example.micka.coopshopexpress.R.id.p5;
import static com.example.micka.coopshopexpress.R.id.textView;

public class Varukorg extends AppCompatActivity {

    public double total = 0;

    private TextView t1 = null;
    private TextView t2 = null;
    private TextView t3 = null;
    private TextView t4 = null;
    private TextView t5 = null;
    private TextView t6 = null;
    private TextView t7 = null;
    private TextView t8 = null;
    private TextView t9 = null;
    private TextView t10 = null;
    private TextView t11 = null;
    private TextView t12 = null;

    private TextView c1 = null;
    private TextView c2 = null;
    private TextView c3 = null;
    private TextView c4 = null;
    private TextView c5 = null;
    private TextView c6 = null;
    private TextView c7 = null;
    private TextView c8 = null;
    private TextView c9 = null;
    private TextView c10 = null;
    private TextView c11 = null;
    private TextView c12 = null;

    private static final String LOG_TAG = Varukorg.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Setting handla layout");
        setContentView(R.layout.varukorg);
        Log.d(LOG_TAG, "Setting handla done");

        Log.d(LOG_TAG, "checkScanned (from onCreate()");
        initTextViews();
        initShoppingCart();
        initShoppingCost();
        checkScanned();

    }

    private void initTextViews() {
        for (int i = 1; i < Session.getInstance().shoppingList.size(); i++) {

        }
    }

    private void initShoppingCart() {

        t1 = (TextView) findViewById(R.id.p1);
        t2 = (TextView) findViewById(R.id.p2);
        t3 = (TextView) findViewById(R.id.p3);
        t4 = (TextView) findViewById(R.id.p4);
        t5 = (TextView) findViewById(R.id.p5);
        t6 = (TextView) findViewById(R.id.p6);
        t7 = (TextView) findViewById(R.id.p7);
        t8 = (TextView) findViewById(R.id.p8);
        t9 = (TextView) findViewById(R.id.p9);
        t10 = (TextView) findViewById(R.id.p10);
        t11 = (TextView) findViewById(R.id.p11);
        t12 = (TextView) findViewById(R.id.p12);
    }

    private void initShoppingCost() {

        c1 = (TextView) findViewById(R.id.p1summa);
        c2 = (TextView) findViewById(R.id.p2summa);
        c3 = (TextView) findViewById(R.id.p3summa);
        c4 = (TextView) findViewById(R.id.p4summa);
        c5 = (TextView) findViewById(R.id.p5summa);
        c6 = (TextView) findViewById(R.id.p6summa);
        c7 = (TextView) findViewById(R.id.p7summa);
        c8 = (TextView) findViewById(R.id.p8summa);
        c9 = (TextView) findViewById(R.id.p9summa);
        c10 = (TextView) findViewById(R.id.p10summa);
        c11 = (TextView) findViewById(R.id.p11summa);
        c12 = (TextView) findViewById(R.id.p12summa);
    }

    public void onCheckListClick(View view) {

        if (view.getId() == R.id.checkList) {

            Intent i = new Intent(Varukorg.this, Handla.class);
            startActivity(i);

        }
    }

    public void onExitClick(View view) {
        Log.d(LOG_TAG, "Exit button has been clicked");

        if (view.getId() == R.id.exitButton) {

            Intent i = new Intent(Varukorg.this, Avbryt.class);
            startActivity(i);

            setAllItemsToNotScanned();
        }
    }

    public void onShoppingClick(View view) {
        Log.d(LOG_TAG, "Betala button has been clicked");

        if (view.getId() == R.id.shoppingButton) {

            boolean scanned = false;

            for (int i = 1; i < Session.getInstance().shoppingList.size(); i++) {

                Item item = Session.getInstance().shoppingList.get(i);

                if (item.isScanned()) {
                    Log.d(LOG_TAG, "adding product for number " + i);

                    scanned = true;
                    break;
                }
            }

            if (scanned) {

                Intent ing = new Intent(Varukorg.this, Betala.class);
                startActivity(ing);

            } else {

                Intent intent = new Intent(Varukorg.this, Popup13.class);
                startActivity(intent);
            }

        }

    }


    public void setListName() {

        String ln = Session.getInstance().shoppingList.get(0).getProduct();

        final TextView textView = (TextView) findViewById(listName);
        textView.setText(ln);
    }

    public void onSkannaVaraClick(View view) {

        if (view.getId() == R.id.skanna) {

            Intent i = new Intent(Varukorg.this, Skanna.class);
            startActivity(i);

        }
    }

    private void checkScanned() {
        Log.d(LOG_TAG, "checkScanned()");

        for (int i = 1; i < Session.getInstance().shoppingList.size(); i++) {

            Item item = Session.getInstance().shoppingList.get(i);
            Log.d(LOG_TAG, "checking " + i + " name: " + item.getProduct() + " isScanned: " + item.isScanned());

            if (item.isScanned()) {
                Log.d(LOG_TAG, "adding product for number " + i);

                TextView textView1 = checkTextViews();
                TextView textView2 = checkCostViews();
                addProduct(item, textView1);
                addCost(item, textView2);


            } else {

                Log.d(LOG_TAG, "Ingen vara är skannad än");
                setListName();
            }

        }

    }

    private TextView checkTextViews() {


        if (t1.getText().toString().length() == 0) {

            return t1;

        } else if (t2.getText().toString().length() == 0) {

            return t2;

        } else if (t3.getText().toString().length() == 0) {

            return t3;

        } else if (t4.getText().toString().length() == 0) {

            return t4;

        } else if (t5.getText().toString().length() == 0) {

            return t5;

        } else if (t6.getText().toString().length() == 0) {

            return t6;

        } else if (t7.getText().toString().length() == 0) {

            return t7;

        } else if (t8.getText().toString().length() == 0) {

            return t8;

        } else if (t9.getText().toString().length() == 0) {

            return t9;

        } else if (t10.getText().toString().length() == 0) {

            return t10;

        } else if (t11.getText().toString().length() == 0) {

            return t11;

        } else {

            return t12;

        }

    }

    private TextView checkCostViews() {


        if (c1.getText().toString().length() == 0) {

            return c1;

        } else if (c2.getText().toString().length() == 0) {

            return c2;

        } else if (c3.getText().toString().length() == 0) {

            return c3;

        } else if (c4.getText().toString().length() == 0) {

            return c4;

        } else if (c5.getText().toString().length() == 0) {

            return c5;

        } else if (c6.getText().toString().length() == 0) {

            return c6;

        } else if (c7.getText().toString().length() == 0) {

            return c7;

        } else if (c8.getText().toString().length() == 0) {

            return c8;

        } else if (c9.getText().toString().length() == 0) {

            return c9;

        } else if (c10.getText().toString().length() == 0) {

            return c10;

        } else if (c11.getText().toString().length() == 0) {

            return c11;

        } else {

            return c12;

        }

    }

    public void addProduct(Item item, TextView textView) {

        textView.setText(String.valueOf(item.getProduct()));

    }

    public void addCost(Item item, TextView textView) {

        double cost = item.getCost();
        cost = Math.round(cost * 100.0) / 100.0;

        textView.setText(String.format("%.2f", cost));

        setTotal(cost);

    }

    private void setTotal(Double cost) {

        total = total + cost;
        total = Math.round(total * 100.0) / 100.0;
        String total2 = String.valueOf(total);

        TextView t = (TextView) findViewById(R.id.totaltSEK);
        t.setText(String.valueOf(total2 + " kr"));

    }

    public static void setAllItemsToNotScanned() {

            for (int i = 1; i < Session.getInstance().shoppingList.size(); i++) {

                Item item = Session.getInstance().shoppingList.get(i);

                 item.setScanned(false);

            }

    }
}
