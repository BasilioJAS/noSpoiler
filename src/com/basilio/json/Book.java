package com.basilio.json;

import java.util.List;

public class Book {
    Integer version;
    BookDescription bookDescription;

}
class BookDescription {
    String name;
    String ISBN;
    Integer pages;
    String autor;
    String idioma;

    @Override
    public String toString() {
        String output = "";
        output += "name :" + name;
        output += "ISBN :" + ISBN;
        output += "pages :" + pages;
        output += "autor :" + autor;
        output += "idioma :" + idioma;
        return output;

    }
}

//    private Integer version;
//    private String nombre;
//    private List<empresa> empresas;
//
//
//    @Override
//    public String toString() {
//        String output = "";
//        for (empresa emp: empresas)
//        {
//            output += "empresa : " + emp.toString() + "\n";
//        }
//
//        return "id: " + id + "\nnombre: " + nombre + "\n" + output;
//    }
//}
//
//class empresa{
//    int value ;
//
//    @Override
//    public String toString() {
//        return "value: " + value ;
//    }
//}
//
//// info for individual city
// class City    {
//    String citiesId;
//    String city;
//    String regionName;
//    // and so on
//}
//
//// top-level object, containing info for lots of cities
// class CityList  {
//    List<City> cities;
//
//    public CityList(List<City> cities) {
//        this.cities = cities;
//    }
}