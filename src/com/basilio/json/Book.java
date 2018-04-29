package com.basilio.json;

import java.util.List;

public class Book {
    Integer version;
    BookDescription bookDescription;
    List<Character> characters;
    List<GeoLoc> geoLocs;



    @Override
    public String toString() {
        String output = "";
        output += "\nversion " + version;
        output += "\nBookDescription " + bookDescription;
        output += "\ncharacters " + characters;
        output += "\ngeoLocs " + geoLocs;

        return output;
    }
}
