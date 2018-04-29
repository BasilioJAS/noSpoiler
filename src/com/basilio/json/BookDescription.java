package com.basilio.json;

import java.util.List;

public class BookDescription {
    String name;
    String ISBN;
    Integer pages;
    String author;
    String lang;
    String[] testArray;
    List<Chapter> chapters;

    @Override
    public String toString() {
        String output = "{";
        output += "\nname :" + name;
        output += "\nISBN :" + ISBN;
        output += "\npages :" + pages;
        output += "\nauthor :" + author;
        output += "\nlang :" + lang;
        output += "\nchapters :" + chapters;

        return output + "\n}";

    }
}
