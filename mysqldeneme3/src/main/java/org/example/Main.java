package org.example;

import org.example.Dattabase.HayvanServisi;
import org.example.Dattabase.model.Hayvan;
import org.example.Dattabase.model.Ogrenci;
import org.example.Dattabase.OgrenciServisi;

import java.sql.SQLException;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String connectionUrl="jdbc:mysql://localhost:3306/deneme_2";
    private static final String USER_SELECT_STRING = "select * from stajyerler_1";

    public static void main(String[] args) throws  ClassNotFoundException,SQLException {

            OgrenciServisi ogrenciServisi = new OgrenciServisi();
            HayvanServisi   hayvanServisi=new HayvanServisi();

    //    System.out.println(ogrenciServisi.stajyerInsert());

      //  System.out.println(ogrenciServisi.stajyerupdate());

        //System.out.println(ogrenciServisi.stajyerDelete());


        List<Ogrenci> myOgrenciList = ogrenciServisi.ogrenciListDon();
        myOgrenciList.forEach(ogrenci -> System.out.println(ogrenci));

        List<Hayvan> myHayvanList = hayvanServisi.hayvanListDon();
        myHayvanList.forEach(hayvan -> System.out.println(hayvan.getIsim()));









        }
    }
