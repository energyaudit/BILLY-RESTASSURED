package src.main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by byang on 2018-09-18.
 */


public class DBStringParameter {
  public static  String rs1;
    public static String inputStr(String nam) throws Exception {
     String name=nam;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sugarcrm","root","pass");

            Statement stmt=con.createStatement();

        //    ResultSet rs=stmt.executeQuery( "select * from accounts where billing_address_postalcode="+postcode+";");
            ResultSet rs=stmt.executeQuery( "select * from accounts where name="+name+";");
            while(rs.next())
            rs1=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
                    +"  "+rs.getString(4) +"  "+rs.getString(5);
            System.out.println(rs1);
            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs1;
    }

}





