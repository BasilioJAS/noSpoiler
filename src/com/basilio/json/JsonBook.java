package com.basilio.json;

import com.basilio.Main;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.Properties;

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
            System.out.println(book.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /**/
    }
}