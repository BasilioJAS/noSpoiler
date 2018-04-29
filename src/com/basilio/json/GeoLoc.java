package com.basilio.json;

public class GeoLoc {
    int id;
    String names[] = null;
    String description = null;
    int ratio = -1;
    String unity = null;
    int mapId = -1;
    long latitude = -1;
    long longitude = -1;
    boolean know_location = false;


    @Override
    public String toString() {
        String output = "{";
        output += "\nid :" + id;
        output += "\nnames: {";
        for (String name : names)
            output += "\n\t" + name;
        output += "\n}";
        output += "\ndescription :" + description;
        output += "\nratio :" + ratio;
        output += "\nunity :" + unity;
        output += "\nmap :" + mapId;
        output += "\nlatitude :" + latitude;
        output += "\nlongitude :" + longitude;
        output += "\nknow_location :" + know_location;
        return output + "\n}";
    }
}
