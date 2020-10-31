import DataBase.DBHelper;
import DataBase.UserDAO;


import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Connection con = DBHelper.getConn();
//
//        if(con == null){
//            System.out.println("Connection FAil");
//
//        }else{
//            System.out.println("Connected");
//        }
//user insert
//       UserDAO userDAO = new UserDAO();
//       userDAO.createUser("Soe Soe" , "Soe123 ");

//        UserDAO userDAO =  new UserDAO();
//        userDAO.retrieveAllUser();
//        userDAO.getSingleUser(5);

//        UserDAO userDAO = new UserDAO();
//        userDAO.updateUser(5,"Wah Wah");


//        UserDAO userDAO = new UserDAO();
//        userDAO.deleteUser(5);

//
//        UserDAO userDAO =new UserDAO();
//        userDAO.createUser("Hla Hla", "123Hal");

//        UserDAO userDAO =new UserDAO();
//        userDAO.getUserById(7);

        UserDAO userDAO =new UserDAO();
//        userDAO.updateUser(3,"Maung Maung");
        userDAO.updateUser(6,"K‌x");

//        UserDAO userDAO =new UserDAO();
//        userDAO.deleteUser(1);

    }
}
