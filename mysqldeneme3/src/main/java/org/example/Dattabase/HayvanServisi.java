package org.example.Dattabase;

import org.example.Dattabase.model.Hayvan;

import java.sql.SQLException;
import java.util.List;

public class HayvanServisi {


    public Integer hayvanInsert(Hayvan hayvan) {

        String insertQuery = "INSERT INTO Hayvanlar (isim,beslenme,yaşamyeri,bacaksayi)VALUES('%s','%s','%s','%s')";

        String preparedInsert = String.format(insertQuery, hayvan.getIsim(), hayvan.getBeslenme(), hayvan.getYaşamyeri(), hayvan.getBacaksayi());

        return DBOparation.insertProcess(preparedInsert);

    }

    public List<Hayvan> hayvanListDon(Hayvan hayvan) throws SQLException {

        String selectString = "select * from Hayvanlar %s";

        String preparedSQL = addWhereStateToSql(selectString, hayvan);

        List<Hayvan> hayvanList = (List<Hayvan>) DBOparation.resultSet(preparedSQL, hayvan);

        return hayvanList;
    }

    public Integer hayvanUpdate(Hayvan whereObject, String isim) throws SQLException {

        String updateSql = "UPDATE Hayvanlar Set isim = '" + isim + "' %s";

        String preparedUpdate = addWhereStateToSql(updateSql, whereObject);

        return DBOparation.updateProcess(preparedUpdate);
    }


    public Integer hayvanDelete(Hayvan hayvan) {

        String deleteSql = "delete from Hayvanlar %s";

        String preparedDelete = addWhereStateToSql(deleteSql, hayvan);

        return DBOparation.deleteProcess(preparedDelete);

    }


    private String addWhereStateToSql(String sql, Hayvan hayvan) {


        StringBuilder stringBuilder = new StringBuilder(" where ");

        boolean andFlag = false;

        if (hayvan.getId() != null) {
            stringBuilder.append(" id= ").append(hayvan.getId());
            andFlag = true;
        }


        if (hayvan.getBacaksayi() != null) {
            if (andFlag)
                stringBuilder.append(" and ");
            stringBuilder.append(" bacaksayi= ").append(hayvan.getBacaksayi());
            andFlag = true;
        }

        if (hayvan.getIsim() != null && !hayvan.getIsim().isEmpty()) {
            if (andFlag)
                stringBuilder.append(" and ");
            stringBuilder.append(" isim= '").append(hayvan.getIsim()).append("'");
            andFlag = true;
        }
        if (hayvan.getBeslenme() != null && !hayvan.getBeslenme().isEmpty()) {
            if (andFlag)
                stringBuilder.append(" and ");
            stringBuilder.append(" beslenme= '").append(hayvan.getBeslenme()).append("'");
            andFlag = true;
        }

        if (hayvan.getYaşamyeri() != null && !hayvan.getYaşamyeri().isEmpty()) {
            if (andFlag)
                stringBuilder.append(" and ");
            stringBuilder.append(" yasamyeri= '").append(hayvan.getYaşamyeri()).append("'");
        }


        if (stringBuilder.length() > 7) {
            return String.format(sql, stringBuilder.toString());
        }

        return String.format(sql, "");
    }

}


