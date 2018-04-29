package com.basilio.json;

import com.basilio.Main;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.Properties;

public class JsonBook {




    public JsonBook()
    {
        init("");
    }

    public void init(String fileName)
    {
        /*
        	final String json = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
	final Gson gson = new Gson();
    final Properties properties = gson.fromJson(json, Properties.class);
        */


        Gson gson = new Gson();
      //  InputStream is = Main.class.getClassLoader().getResourceAsStream("test3.json");
     //   InputStream is = Main.class.getResourceAsStream("test3.json");
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

        JsonReader reader = null;
        try {
          //  final String json = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
            reader = new JsonReader(new FileReader("test3.json"));

            /** /
            Properties properties = gson.fromJson(json, Properties.class);
            /**/
            Book book = gson.fromJson(reader, Book.class);
            /**/

            System.out.println(book.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //       List<Review> data = gson.fromJson(reader, REVIEW_TYPE); // contains the whole reviews li

    //    Reader reader = new Reade
   //     FileReader()
    //    System.out.println(bufferedReader.toString());
     //   Properties prop = gson.from



    }
    /*
    final String json = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
	final Gson gson = new Gson();
    final Properties properties = gson.fromJson(json, Properties.class);
    assertEquals("46", properties.getProperty("id"));
	assertEquals("Miguel", properties.getProperty("nombre"));
	assertEquals("Autentia", properties.getProperty("empresa"));
	assertNull(properties.getProperty("propiedadInexistente"));


final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
	final InputStream is = GsonTest.class.getClassLoader().getResourceAsStream("json.txt");
	final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
	final Empleado empleado = gson.fromJson(bufferedReader, Empleado.class);
	assertNotNull(empleado.getVacaciones());
	assertEquals(2, empleado.getVacaciones().size());
	assertEquals(5, empleado.getVacaciones().get(0).getTotalDias());
	assertEquals(7, empleado.getVacaciones().get(1).getTotalDias());
	bufferedReader.close();

     */
}
