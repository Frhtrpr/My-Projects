package org.example.Dattabase;

import org.example.Dattabase.Interface.SelectTable;
import org.example.Dattabase.model.Hayvan;
import org.example.Dattabase.model.Ogrenci;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HayvanServisi {

    private static final String USER_SELECT_STRING = "select * from Hayvanlar";

    private static final String updateQuery = "UPDATE Hayvanlar Set isim = ? where id =?";
    private static final String insertQuery = "INSERT INTO Hayvanlar (isim,beslenme,yaşamyeri,bacaksayi)VALUES(?,?,?,?)";

    private static final String deleteQuery = "delete from Hayvanlar where id=? ";

    public List<Hayvan> hayvanListDon() throws SQLException {
        SelectTable hayvan =new Hayvan();


        List<Hayvan> hayvanList= (List<Hayvan>) DBOparation.resultSet(USER_SELECT_STRING,hayvan);

        return hayvanList;
    }

    public Integer hayvanupdate() throws SQLException {
        return DBOparation.updateProcess(updateQuery,"Kacmaz",2);
    }

    public Integer hayvanInsert() throws  SQLException{
        return DBOparation.insertProcess(insertQuery,"Devran","Yılmaz",true,24);
    }

    public Integer hayvanDelete() throws  SQLException{
        return DBOparation.deleteProcess(deleteQuery,3);
    }

}


