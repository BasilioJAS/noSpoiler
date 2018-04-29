package com.basilio.json;

public class Character {
    int id;
    String names[];
    int age;
    String initialDescription;
    int location;


    @Override
    public String toString() {
        String output = "{";
        output += "\nid :" + id;
        output += "\nnames :" + names;
        output += "\nage :" + age;
        output += "\nlocation :" + location;
        output += "\ninitialDescription :" + initialDescription;
        return output + "\n}";
    }
}
