package DataBase;

import java.sql.*;

public class UserDAO {

    //Not Secure Design
    //statement sematic is also smart
//    public void createUserBackup(){
//
//        String query = "INSERT users (name,pass) VALUES('Aung Aung ', '123Aung')";
//        Connection connection = DBHelper.getConn();
//
//        try {
//            Statement stmt = connection.createStatement();
//            int result = stmt.executeUpdate(query);
//            if(result == 1){
//                System.out.println("User insert sucessfully");
//            }else{
//                System.out.println("User Insert fail");
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void createUser(String name,String pass) {
//        String query = "INSERT INTO users (name,pass) VALUES ('" + name + "', '" + pass + "')";
//        Connection con = DBHelper.getConn();
//        Statement stmt = null;
//
//        try {
//             stmt = con.createStatement();
//            int result = stmt.executeUpdate(query);
//            if(result ==1 ){
//                System.out.println("User Create Success");
//            }
//            else{
//                System.out.println("User Create Fail");
//            }
//
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            if(con != null ){
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if(stmt!=null){
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public void retrieveAllUser(){
//        String query = "SELECT * FROM users";
//
//        try(Connection con = DBHelper.getConn(); Statement stmt = con.createStatement()){
//            ResultSet set =stmt.executeQuery(query);
//            while(set.next()){
//                int id = set.getInt("id");
//                String name = set.getString("name");
//                String pass = set.getString("pass");
//                System.out.printf("Id is %d Name is %s and password is %s\n" ,id,name,pass);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void getSingleUser(int id){
//        String query = "SELECT * FROM users WHERE id='" +id+ "'";
//        try(Connection connection = DBHelper.getConn(); Statement stmt =connection.createStatement()){
//                    ResultSet set = stmt.executeQuery(query);
//                    if(set.next())
//                        System.out.printf("ID is %d name is %s pass is %s",
//                                set.getInt("id"),
//                                set.getString("name"),
//                                set.getString("pass")
//                        );
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void updateUser(int id,String name){
//        String query = "UPDATE users SET name='"+name+"' WHERE id ='"+id+"'";
//        try(Connection connection = DBHelper.getConn(); Statement stmt =connection.createStatement()) {
//            int result = stmt.executeUpdate(query);
//            if(result==1 ){
//                System.out.println("User update sucessfully");
//            }
//            else{
//                System.out.println("User update fail");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteUser(int id){
//        String query = "DELETE FROM users where id='"+id+"'";
//        try(Connection connection = DBHelper.getConn(); Statement stmt =connection.createStatement()) {
//              int result =   stmt.executeUpdate(query);
//
//              if(result ==1 ){
//                  System.out.println("User Deleted");
//              }else{
//                  System.out.println("User Deleted Fail");
//              }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


    //Secure Design
    public void createUser(String name,String pass){
        String query = "INSERT INTO users (name,pass) VALUES(?,?)";
        Connection connection = DBHelper.getConn();
        PreparedStatement ps = null;
        try{
             ps = connection.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,pass);
            int result = ps.executeUpdate();
            if(result ==1){
                System.out.println("User Create Sucessful");
            }else{
                System.out.println("User Create Fail");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                   e.printStackTrace();
                }
            }

            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getUserById(int id){
        String query = "SELECT * FROM users WHERE id= ?";
        Connection connection = DBHelper.getConn();
        PreparedStatement ps = null;

        try{
            ps = connection.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet set = ps.executeQuery();

            if(set.next()){
                System.out.printf(
                   "ID is %d name is %s pass is %s",
                        set.getInt("id"),
                        set.getString("name"),
                        set.getString("pass")
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id,String name){
        String query  = "UPDATE users SET name=? WHERE id=?";
        try(Connection con = DBHelper.getConn();PreparedStatement ps = con.prepareStatement(query)){

            ps.setString(1,name);     // String query  = "UPDATE users SET name=? WHERE id=?";  အဲ့ဒီ parameter ကို ယူတာ
            ps.setInt(2,id);         //String query  = "UPDATE users SET name=? WHERE id=?"; အဲ့ဒီ parameter ကိုယူတာ

            int result = ps.executeUpdate();
            if(result ==1 ){
                System.out.println("Sucesss");
            }else{
                System.out.println("fail");
            }

        } catch (SQLException e) {
           e.printStackTrace();
        }
    }

//    public void deleteUser(int id){
//        String query  = "DELETE FROM    users WHERE id=?";
//        try(Connection con = DBHelper.getConn();PreparedStatement ps = con.prepareStatement(query)){
//
//
//            ps.setInt(1,id);
//
//            int result = ps.executeUpdate();
//            if(result ==1 ){
//                System.out.println("Sucesss");
//            }else{
//                System.out.println("fail");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }





    }

