package org.example.Dattabase.Interface;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SelectTable {

    public Object mapTableData(ResultSet myresultSet) throws SQLException;

}
