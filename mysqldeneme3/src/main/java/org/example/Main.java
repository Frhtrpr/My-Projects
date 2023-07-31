package org.example;

import org.example.Dattabase.HayvanServisi;
import org.example.Dattabase.model.Hayvan;
import org.example.Dattabase.OgrenciServisi;

import java.sql.SQLException;

public class Main {

    private static final String connectionUrl="jdbc:mysql://localhost:3306/deneme_2";
    private static final String USER_SELECT_STRING = "select * from stajyerler_1";

    public static void main(String[] args) throws  ClassNotFoundException,SQLException {

            OgrenciServisi ogrenciServisi = new OgrenciServisi();
            HayvanServisi   hayvanServisi=new HayvanServisi();

    //    System.out.println(ogrenciServisi.stajyerInsert());

      //  System.out.println(ogrenciServisi.stajyerupdate());

        //System.out.println(ogrenciServisi.stajyerDelete());


        Hayvan hayvan = new Hayvan();

        hayvan.setBeslenme("etcil");
        hayvan.setYaşamyeri("deniz");



        hayvanServisi.hayvanUpdate(hayvan, "shark");







        }
    }
