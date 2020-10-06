package DataBase;

//import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
//    public void createUserBackUp() {
//        String query = "INSERT users(name,pass) VALUES('Mg Mg','654')";
//        Connection connection = DBHelper.getConn();
//        try {
//            Statement stmt = connection.createStatement();
//            int result = stmt.executeUpdate(query);
//            if (result == 1) {
//                System.out.println("User Insert  Successfully");
//            } else {
//                System.out.println("User Insert Fail");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void createUser(String name, String pass) {
//        String query = "INSERT INTO users (name,pass) VALUES('" + name + "','" + pass + "')";
//        Connection con = DBHelper.getConn();
//        Statement stmt = null;
//
//        try {
//            stmt = con.createStatement();
//            int result = stmt.executeUpdate(query);
//
//            if (result == 1) {
//                System.out.println("User Create Success");
//            } else {
//                System.out.println("User Creation Fail");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (con != null) {
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//
//    public void retrieveAllUser() {
//        String query = "SELECT * FROM users";
//
//        try (Connection con = DBHelper.getConn(); Statement stmt = con.createStatement()) {
//            ResultSet set = stmt.executeQuery(query);
//            while (set.next()) {
//                int id = set.getInt("id");
//                String name = set.getString("name");
//                String pass = set.getString("pass");
//                System.out.printf("Id is %d Name is %s and Password is %s\n", id, name, pass);
//
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void getSingleUser(int id) {
//        String query = "SELECT * FROM users WHERE id = '" + id + "'";
//        try (Connection connection = DBHelper.getConn(); Statement stmt = connection.createStatement()) {
//            ResultSet set = stmt.executeQuery(query);
//            if (set.next())
//                System.out.printf("Id is %d name is %s pass is %s",
//                        set.getInt("id"),
//                        set.getString("name"),
//                        set.getString("pass")
//                );
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void updateUser(int id, String name) {
//        String query = "Update users SET name='" + name + "' WHERE id='" + id + "'";
//        try (Connection connection = DBHelper.getConn(); Statement stmt = connection.createStatement()) {
//            int result = stmt.executeUpdate(query);
//
//            if (result == 1) {
//                System.out.println("User Update SuccessFully ");
//            } else {
//                System.out.println("User Update Fail");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteUser(int id) {
//        String query = "DELETE FROM users where id = '" + id + "'";
//
//        try (Connection connection = DBHelper.getConn(); Statement statement = connection.createStatement()) {
//            int result = statement.executeUpdate(query);
//            if(result == 1){
//                System.out.println("User Delete");
//            }
//            else{
//                System.out.println("User Delete fail");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }











    















}






