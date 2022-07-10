public class Messages {
    public void welcome(){
      System.out.println(Colors.green+"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("+\tVault the best way to save your ass\t     +");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("+\t\t\t\t\t\t     +");
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++"+Colors.RESET_COLOR);
    }

    public void userWindow(String n){
        if (n == null){
          System.out.println("Welcome User");
          System.out.println("Please create an account for better protechtion!");
        }
        System.out.println("VAULT");
        System.out.println("---------------");
        System.out.println("Welcome "+ n);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}
