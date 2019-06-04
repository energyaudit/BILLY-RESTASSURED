package src.main.Java2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by byang on 2018-09-18.
 */
// w  w w. j  ava2s  .co m
public class DataBase3 {
    public static void main(String[] args) throws Exception {



        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sugarcrm","root","pass");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery( "select * from accounts where billing_address_postalcode=20607;");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
                        +"  "+rs.getString(4) +"  "+rs.getString(5));
            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}





