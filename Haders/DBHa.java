package Haders;

public interface DBHa {
    public String name = null;
    public String passwd = null;
 
    public void createTable1() throws Exception;
    public void createTable2() throws Exception;
    public void insertUser() throws Exception;
    public void insertUserData();
    private void modify(String type){}
    private void delete(String type){}
    public void display();
    public void close();

}
