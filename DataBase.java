import Haders.DBHa;
import java.sql.*;

// two table
// one for users
// one for user_data

public class DataBase implements DBHa{
      
    public void connect(){       
      
    }

    @Override
    public void createTable(){

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
