package com.basilio.json;

public class Chapter{
    int id = -1;
    String name = null;
    int startPage = -1;
    int endPage = -1;

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
