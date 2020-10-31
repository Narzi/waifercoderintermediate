package DataBase;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
     Properties properties = null;

//    public static final String DB_DRIVER ="";
//    public static final String DB_URL=    "";
//    public static final String DB_USER ="" ;
//    public static final String DB_PASS = "";

   static  Connection connection = null;
    private DBHelper()  {
        properties  = new Properties();
        try {
            properties.load(new FileReader("src/env.properties"));
//            System.out.println(properties.getProperty("DB_URL"));
            Class.forName(env("DB_DRIVER"));
            connection = DriverManager.getConnection(env("DB_URL"),env("DB_USER"),env("DB_PASS"));



        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

//        System.out.println(env("DB_URL"));


  /*      try {

            //first way

            //second way

            Properties properties = new Properties();
            properties.put("user", DB_USER);
            properties.put("password", DB_PASS);
            connection = DriverManager.getConnection(DB_URL,properties);
            //Third Way
            connection  = DriverManager.getConnection(DB_URL+"?user=" +DB_USER+"&password="+ DB_PASS);







        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

    }



    public static Connection getConn(){

        if(connection == null){

            new DBHelper();
        }

        return connection;

    }


    public String env(String key){
       return properties.getProperty(key);

    }

}
