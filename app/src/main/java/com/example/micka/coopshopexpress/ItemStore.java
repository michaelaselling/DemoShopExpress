package com.example.micka.coopshopexpress;


import java.util.List;

public interface ItemStore {

    List<Item> getAllItems();
    void storeItem(Item m);
    void deleteItem(Item m);
    void open() throws ItemStoreException;
    void close() throws ItemStoreException;

}
