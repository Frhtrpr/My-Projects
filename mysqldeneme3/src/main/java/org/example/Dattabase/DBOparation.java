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

        public static Integer updateProcess(String oneParamUpdateSql){
        try (Connection myConnection = openConnection()){
            PreparedStatement myPreparedStatement = myConnection.prepareStatement(oneParamUpdateSql);
            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer insertProcess(String insertSql) {
        try (Connection myConnection = openConnection()) {

            PreparedStatement myPreparedStatement = myConnection.prepareStatement(insertSql);


            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);


        }

    }




    public static Integer deleteProcess(String oneParamdeleteSql){
        try (Connection myConnection=openConnection()){
            PreparedStatement myPreparedStatement= myConnection.prepareStatement(oneParamdeleteSql);
            return myPreparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
