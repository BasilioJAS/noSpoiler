package com.basilio.json;

import java.util.List;

public class BookDescription {
    String name;
    Long isbn;
    Integer pages;
    String author;
    String lang;
    List<Chapter> chapters;

    @Override
    public String toString() {
        String output = "{";
        output += "\nname :" + name;
        output += "\nISBN :" + isbn;
        output += "\npages :" + pages;
        output += "\nauthor :" + author;
        output += "\nlang :" + lang;
        output += "\nchapters :" + chapters;

        return output + "\n}";

    }
}
