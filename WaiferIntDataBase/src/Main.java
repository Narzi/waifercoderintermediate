import DataBase.DBHelper;
import DataBase.UserDAO;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
/*       DBHelper helper = new DBHelper();
        Connection con = DBHelper.getConn();

        if(con == null){
            System.out.println("Connection Fail");
        }else{
            System.out.println("Connected!");
        }

 */
        UserDAO userDAO=new UserDAO();
//        userDAO.createUser("SoeSoe", "SoeSoe123");
//        userDAO.retrieveAllUser();
//        userDAO.getSingleUser(5);
//        userDAO.updateUser(5,"WAH WAH");
        userDAO.deleteUser(3);
    }
}
