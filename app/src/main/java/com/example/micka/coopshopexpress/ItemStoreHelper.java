package com.example.micka.coopshopexpress;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class ItemStoreHelper extends SQLiteOpenHelper {

    public static final String TABLE_ITEMS = "items";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_ITEM_NAME = "product";
    //public static final String COLUMN_ITEM_LISTNAME = "list_name";
    public static final String COLUMN_ITEM_SCANNED = "is_scanned";
    public static final String COLUMN_ITEM_EAN = "eancode";
    public static final String COLUMN_ITEM_PRICE = "price";

    private static final String DATABASE_NAME = "items.db";
    private static final int DATABASE_VERSION = 3;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_ITEMS + "( "
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_ITEM_NAME + " text, "
            + COLUMN_ITEM_EAN + " text, "
            + COLUMN_ITEM_SCANNED + " boolean, "
            + COLUMN_ITEM_PRICE + " double);";

    private static final String LOG_TAG = ItemStoreHelper.class.getSimpleName();


    public ItemStoreHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d(LOG_TAG, "ItemStoreHelper()");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d(LOG_TAG, "onCreate()");
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        Log.d(LOG_TAG,
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_ITEMS);
        onCreate(sqLiteDatabase);
    }

}
