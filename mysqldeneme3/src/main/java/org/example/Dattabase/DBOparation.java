package org.example.Dattabase;

import org.example.Dattabase.Interface.SelectTable;

import java.sql.*;

public class DBOparation {

    private static final String connectionUrl="jdbc:mysql://localhost:3306/deneme_2";
    private static final String userName="root";
    private static final String password="231Ferhat";


    public static Connection openConnection () throws SQLException {

        return DriverManager.getConnection(connectionUrl, userName,password);

    }
    public  static Object resultSet (String selectSql, SelectTable selectTable) throws SQLException {
        try (Connection myConnection = openConnection()) {
            Statement myConnectionStatement = myConnection.createStatement();
            ResultSet myResultSet = myConnectionStatement.executeQuery(selectSql);


            return selectTable.mapTableData(myResultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        public static Integer updateProcess(String oneParamUpdateSql,String surname,Integer id){
        try (Connection myConnection = openConnection()){
            PreparedStatement myPreparedStatement = myConnection.prepareStatement(oneParamUpdateSql);
            myPreparedStatement.setString(1,surname);
            myPreparedStatement.setInt(2,id);
            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer insertProcess(String oneParaminsertSql,String name,String surname,Boolean active,Integer age) {
        try (Connection myConnection = openConnection()) {

            PreparedStatement myPreparedStatement = myConnection.prepareStatement(oneParaminsertSql);

            myPreparedStatement.setString(1, name);
            myPreparedStatement.setString(2, surname);
            myPreparedStatement.setBoolean(3, active);
            myPreparedStatement.setInt(4, age);


            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);


        }
    }
    public static Integer deleteProcess(String oneParamdeleteSql,Integer id){
        try (Connection myConnection=openConnection()){
            PreparedStatement myPreparedStatement= myConnection.prepareStatement(oneParamdeleteSql);
            myPreparedStatement.setInt(1,id);
            return myPreparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
