package org.example;
import java.sql.*;

import static org.example.DBOparation1.resultSet;

public class Main {

    private static final String connectionUrl = "jdbc:mysql://localhost:3306/deneme_2";
    private static final String USER_SELECT_STRING = "select * from stajyerler_1";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ResultSet myResultSet=resultSet(USER_SELECT_STRING);


        String update= "UPDATE stajyerler_1 Set age=? where id=?";
    DBOparation1.updateProcess(update,28,3);

    String insert="INSERT INTO stajyerler_1(id,name,surname,active,age)VALUES(?,?,?,?,?)";
    DBOparation1.insertProcess(insert,8,"Sinem","Gunes",true,23);

    String delete="Delete from stajyerler_1 where name=?";
    DBOparation1.deleteProcess(delete,"Ayse");
    }
}