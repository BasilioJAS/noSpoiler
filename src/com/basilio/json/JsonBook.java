package com.basilio.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class JsonBook {

    public JsonBook() {
        init("test3.json");
    }

    public void init(String fileName) {
        /** /
        Book b = new Book();
        BookDescription bd = new BookDescription();
        b.version = 1;
        bd. name = "el señor de los anillos" ;
        bd.ISBN = "1234567890123";
        bd.te
        b.bookDescription = bd;


        /**/
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader(fileName));
            Book book = gson.fromJson(reader, Book.class);
           // System.out.println(book.toString());
            final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            final String representacionBonita = prettyGson.toJson(book);
            System.out.println("\n\n\n" + representacionBonita);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        /**/
    }
}