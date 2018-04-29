package com.basilio.json;

public class Chapter{
    int id;
    String name;
    int startPage;
    int endPage;

    @Override
    public String toString() {
        String output = "{";
        output += "\nid :" + id;
        output += "\nname :" + name;
        output += "\nstartPage :" + startPage;
        output += "\nendPage :" + endPage;
        return output + "\n}";
    }
}
