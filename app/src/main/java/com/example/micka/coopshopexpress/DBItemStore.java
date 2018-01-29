package com.example.micka.coopshopexpress;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.R.attr.name;


public class DBItemStore implements ItemStore {

    private static final String LOG_TAG = DBItemStore.class.getSimpleName();

    // Database fields
    private SQLiteDatabase database;
    private ItemStoreHelper dbHelper;
    private String[] allColumns = {
            ItemStoreHelper.COLUMN_ID,
            ItemStoreHelper.COLUMN_ITEM_NAME,
            ItemStoreHelper.COLUMN_ITEM_EAN,
            ItemStoreHelper.COLUMN_ITEM_SCANNED,
            ItemStoreHelper.COLUMN_ITEM_PRICE};

    public DBItemStore(Context context) {
        Log.d(LOG_TAG, "DBItemStore()");
        dbHelper = new ItemStoreHelper(context);
    }

    public void open() throws ItemStoreException {
        Log.d(LOG_TAG, "open()");
        try {
            database = dbHelper.getWritableDatabase();
        } catch (SQLException e) {
            throw new ItemStoreException(e);
        }
    }

    public void close() {
        Log.d(LOG_TAG, "close()");
        dbHelper.close();
    }

    public Item createItem(Item item) {
        Log.d(LOG_TAG, "createItem()");
        ContentValues values = new ContentValues();
        //values.put(ItemStoreHelper.COLUMN_ITEM_LISTNAME, name);
        values.put(ItemStoreHelper.COLUMN_ITEM_NAME, item.getProduct());
        values.put(ItemStoreHelper.COLUMN_ITEM_SCANNED, item.isScanned());
        Log.d(LOG_TAG, "createItem()  id: " + item.getId());
        values.put(ItemStoreHelper.COLUMN_ITEM_EAN, ""+item.getId());
        values.put(ItemStoreHelper.COLUMN_ITEM_PRICE, item.getCost());

        long insertId = database.insert(ItemStoreHelper.TABLE_ITEMS, null,
                values);
        Cursor cursor = database.query(ItemStoreHelper.TABLE_ITEMS,
                allColumns, ItemStoreHelper.COLUMN_ID + " = " + insertId, null,
                null, null, null);
        cursor.moveToFirst();
        Item newItem = cursorToItem(cursor);
        cursor.close();
        return newItem;
    }

    public void deleteItem(Item i) {
        Log.d(LOG_TAG, "deleteItem()");
        database.delete(ItemStoreHelper.TABLE_ITEMS, ItemStoreHelper.COLUMN_ITEM_NAME
                + " = '" + i.getProduct() + "'", null);
        System.out.println("Item deleted: " + i);
    }

    public List<Item> getAllItems() {
        Log.d(LOG_TAG, "getAllItems()");

        List<Item> items = new ArrayList<>();

        Cursor cursor = database.query(ItemStoreHelper.TABLE_ITEMS,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Item i = cursorToItem(cursor);
            Log.d(LOG_TAG, "Adding :" + i);
            items.add(i);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return items;
    }

    private Item cursorToItem(Cursor cursor) {
        Log.d(LOG_TAG, "cursorToItem()");
        String name = cursor.getString(1);
        // boolean scanned = cursor.getInt(2)!=0; // if not zero, then true
        String id = cursor.getString(2);
        Log.d(LOG_TAG, "cursorToItem()  id :" + id);
        double price = cursor.getDouble(4);
  //      String ListName = cursor.getString(5);

        return new Item(name, id, price);
    }

    @Override
    public void storeItem( Item i) {
        Log.d(LOG_TAG, "storeItem: " + i);
        createItem(i);
    }

}
