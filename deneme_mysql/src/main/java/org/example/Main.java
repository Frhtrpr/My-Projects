package org.example;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String connectionUrl = "jdbc:mysql://localhost:3306/deneme_2";
    private static final String USER_SELECT_STRING = "select * from stajyerler_1";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

     //INSERT INTO
        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "231Ferhat");
            Statement statement = con.createStatement();)
            {
            String sql = "Insert Into stajyerler_1 Values(6,'Fatma','Guney',true,19)";

            statement.executeUpdate(sql);
        }

        catch(SQLException sqlException){
            System.out.println(" SQL HATASI");
        }

        //UPDATE
        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "231Ferhat");
             Statement statement = con.createStatement();)
        {
            String sql = "Update stajyerler_1 SET name=Ferhat Tunc WHERE id=1";

            statement.executeUpdate(sql);
        }

        catch(SQLException sqlException){
            System.out.println(" SQL HATASI");
        }

        //DELETE
        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "231Ferhat");
             Statement statement = con.createStatement();)
        {
            String sql = "Delete  From stajyerler_1 WHERE age=22";

            statement.executeUpdate(sql);

        }

        catch(SQLException sqlException){
            System.out.println(" SQL HATASI");
        }

        try (Connection con = DriverManager.getConnection(connectionUrl, "root", "231Ferhat")) {


            Statement statement = con.createStatement();


            ResultSet result = statement.executeQuery(USER_SELECT_STRING);


            System.out.println("id -Name  ---Surname -- Active --age ");
            while (result.next()) {

                System.out.print(result.getInt(1) + "  ");
                System.out.print(result.getString(2) + "  ");
                System.out.print(result.getString(3) + "  ");
                System.out.print(result.getBoolean(4) + " ");
                System.out.println(result.getInt(5));

            }
        }
            catch(SQLException sqlException){
                System.out.println(" SQL HATASI");
            }
        }
    }


