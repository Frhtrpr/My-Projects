package org.example.Dattabase.model;

import org.example.Dattabase.Interface.SelectTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ogrenci implements SelectTable {
    private  Integer id;
    private  String name;
    private String surname;
    private  Integer age;
    private  Boolean active;

    public Ogrenci(Integer id,String name,String surname,Integer age,Boolean active){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.active=active;
    }

    @Override
    public String toString() {
        String donustur = "id: " +id+" name : "+name+ " surname: "+ surname+ " age: "+age+" active: "+(active );
        return donustur;
    }




    public Ogrenci(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    @Override
    public Object mapTableData(ResultSet myresultSet) throws SQLException {

        List<Ogrenci> ogrenciList1 =new ArrayList<>();
        while (myresultSet.next()){
            int id1 = myresultSet.getInt("id");
            String name =myresultSet.getString("name");
            String surname =myresultSet.getString("surname");
            Integer age=myresultSet.getInt("age");
            Boolean active=myresultSet.getBoolean("active");

           ogrenciList1.add(new Ogrenci(id1,name,surname,age,active));
        }
        return ogrenciList1;
    }
}
