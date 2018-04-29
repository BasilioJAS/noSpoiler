package com.basilio.json;

public class Character {
    int id;
    String names[];
    int age;
    String initialDescription;
    String illustrations[];
    int location;


    @Override
    public String toString() {
        String output = "{";
        output += "\nid :" + id;

        output += "\nnames: {";
        for (String name : names)
            output += "\n\t" + name;
        output += "\n}";
        output += "\nage :" + age;
        output += "\nlocation :" + location;
        output += "\ninitialDescription :" + initialDescription;
        return output + "\n}";
    }
}
