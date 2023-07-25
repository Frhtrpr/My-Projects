package org.example;

import java.sql.*;

public class DBOparation1 {

    private static final String connectionUrl = "jdbc:mysql://localhost:3306/deneme_2";

    private static final String userName = "root";

    private static final String password = "231Ferhat";

    public static Connection openConnection() throws SQLException {

        return DriverManager.getConnection(connectionUrl, userName, password);

    }

    public static ResultSet resultSet(String selectSql) {
        try (Connection myConnection = openConnection()) {
            Statement myConnectionStatement = myConnection.createStatement();
            ResultSet myResultSet = myConnectionStatement.executeQuery(selectSql);
            return myResultSet;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static  Integer updateProcess(String oneParamUpdateSql, Integer age, Integer id) {
        try (Connection myConnection = openConnection()) {
            PreparedStatement myPreparedStatement = myConnection.prepareStatement(oneParamUpdateSql);
            myPreparedStatement.setInt(1, age);
            myPreparedStatement.setInt(2, id);
            return myPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    public static Integer insertProcess(String oneParamInsertSql,Integer id,String name_1,String surname,Boolean active,Integer age){
        try (Connection connection1 = openConnection()){
            PreparedStatement preparedStatement1=connection1.prepareStatement(oneParamInsertSql);
            preparedStatement1.setInt(1,id);
            preparedStatement1.setString(2,name_1);
            preparedStatement1.setString(3,surname);
            preparedStatement1.setBoolean(4,active);
            preparedStatement1.setInt(5,age);

            return preparedStatement1.executeUpdate();
        }
        catch (SQLException a) {
            throw new RuntimeException(a);
        }
    }

    public static Integer deleteProcess(String oneParamDeleteSql,String name){
        try(Connection connection2= openConnection()){
            PreparedStatement preparedStatement2=connection2.prepareStatement(oneParamDeleteSql);
            preparedStatement2.setString(1,name);
            return preparedStatement2.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}