package Haders;

public interface DBHa {
    public String name = null;
    public String passwd = null;

    
    public void createTable();
    public void insertUser();
    public void insertUserData();
    private void modify(String type){}
    private void delete(String type){}
    public void display();
    public void close();
}
