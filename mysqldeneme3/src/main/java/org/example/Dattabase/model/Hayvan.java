package org.example.Dattabase.model;

import org.example.Dattabase.Interface.SelectTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Hayvan implements SelectTable {

    private Integer id;
    private String isim;
    private String beslenme;
    private String yaşamyeri;
    private Integer bacaksayi;

    public Hayvan(Integer id, String isim, String beslenme, String yaşamyeri, Integer bacaksayi) {
        this.id = id;
        this.isim = isim;
        this.beslenme = beslenme;
        this.yaşamyeri = yaşamyeri;
        this.bacaksayi = bacaksayi;
    }

    public Hayvan(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBeslenme() {
        return beslenme;
    }

    public void setBeslenme(String beslenme) {
        this.beslenme = beslenme;
    }

    public String getYaşamyeri() {
        return yaşamyeri;
    }

    public void setYaşamyeri(String yaşamyeri) {
        this.yaşamyeri = yaşamyeri;
    }

    public Integer getBacaksayi() {
        return bacaksayi;
    }

    public void setBacaksayi(Integer bacaksayi) {
        this.bacaksayi = bacaksayi;
    }

    @Override
    public Object mapTableData(ResultSet myresultSet) throws SQLException {

        List<Hayvan>hayvanList =new ArrayList<>();
        while (myresultSet.next()) {
            int tableId = myresultSet.getInt("id");
            String isim =myresultSet.getString("isim");
            String yaşamyeri=myresultSet.getString("yaşamyeri");
            String beslenme=myresultSet.getString("beslenme");
            Integer bacaksayi=myresultSet.getInt("bacaksayi");

            hayvanList.add(new Hayvan(tableId,isim,yaşamyeri,beslenme,bacaksayi));
        }
        return hayvanList;

    }




}
