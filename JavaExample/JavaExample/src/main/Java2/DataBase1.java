package src.main.Java2;

import java.sql.*;

/**
 * Created by byang on 2018-09-18.
 */
// w  w w. j  ava2s  .co m
public class DataBase1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Inserting/Change values in  database table!");
        Connection con = null;
        String url = "jdbc:jtds:sqlserver://sqlqa:1433;databaseName=MyCitadel_L_Dev02";
        String username = "byang";
        String password = "Welcome2IDSTeam!";
        String driver = "net.sourceforge.jtds.jdbc.Driver";
        Class.forName(driver);
        con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        int val = st.executeUpdate("update [MyCitadel_L_Dev02].[dbo].[instant_payment_clients] set payment_provider_type=1 where bank_name='Commerzbank'");

        }
        }



