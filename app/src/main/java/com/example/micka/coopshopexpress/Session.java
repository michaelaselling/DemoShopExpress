package com.example.micka.coopshopexpress;

import java.util.ArrayList;
import java.util.List;

public class Session {

        private static Session session;
    //private listName

    public List<Item> shoppingList;
    public List<Item> shoppingCart = new ArrayList<>();
    public ItemStore store;

    public List<Item> varukorg;




        // private constructor to prevent other from creating Session objects
        private Session() {};

        static {
            session = new Session();
        }

        public static Session getInstance() {
            return session;
        }

    }

