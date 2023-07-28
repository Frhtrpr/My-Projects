package org.example.Dattabase;

import org.example.Dattabase.Interface.SelectTable;
import org.example.Dattabase.model.Ogrenci;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OgrenciServisi {

    private static final String USER_SELECT_STRING = "select * from stajyerler_1";

    private static final String updateQuery = "UPDATE stajyerler_1 Set surname = ? where id =?";
    private static final String insertQuery = "INSERT INTO stajyerler_1 (name,surname,active,age)VALUES(?,?,?,?)";

    private static final String deleteQuery = "delete from stajyerler_1 where id=? ";


    public List<Ogrenci> ogrenciListDon() throws SQLException {
        SelectTable selectTable =new Ogrenci();
        List<Ogrenci> ogrenciList = (List<Ogrenci>) DBOparation.resultSet(USER_SELECT_STRING,selectTable);

        return ogrenciList;
}

    public Integer stajyerupdate() throws SQLException {
        return DBOparation.updateProcess(updateQuery,"Durmaz",7);
    }

    public Integer stajyerInsert() throws  SQLException{
        return DBOparation.insertProcess(insertQuery,"ferhat","Mehmet",true,25);
    }

    public Integer stajyerDelete() throws  SQLException{
        return DBOparation.deleteProcess(deleteQuery,3);
}

     }



