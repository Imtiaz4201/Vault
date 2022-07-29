import Haders.DBHa;
import java.sql.*;
import java.sql.DriverManager;
// two table
// one for users
// one for user_data

public class DataBase implements DBHa{

    private String url = "jdbc:mysql://localhost:3306/vault";
    private String user = "root";
    private String passwd = "123456t";
    private Connection conn = getConnection();

    public DataBase() throws Exception{
        createTable1();
    }
    
    public Connection getConnection() throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user,passwd); // connection with database
            System.out.println("Connected");       
            return conn; 
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void createTable1(){
        try {
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS users(id int NOT NULL AUTO_INCREMENT, first_name varchar(50), last_name varchar(50), PRIMARY KEY(id))");
            create.executeUpdate();
            System.out.println("User tabel created");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void createTable2(){
        try{
            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS userData(id int, passwd varchar(30))");
            create.executeUpdate();
            System.out.println("UserData tabel created");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void insertUser(){

    }


    @Override
    public void insertUserData(){

    }


    private void modify(String type){

    }
    
    private void delete(String type){

    }

    @Override
    public void display(){
        System.out.println("hi");
    }

    @Override
    public void close(){

    }

}
