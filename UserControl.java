import java.util.Scanner; 


class Process{
    Process(){

    }

}


public class UserControl extends Process {
    static Scanner input = new Scanner(System.in); // for global access
    static boolean run;
    UserControl(){
        String name = null;
        String date = null;
        String time = null;
    }

    public void run(){
        System.out.println("1.Enter Vault");
        System.out.println("2.Settings");
        System.out.println("3.Exit");
        run = true;
        while (run) {
            try {
                int inp = get_user_input();
                if (inp != -1){
                    init(inp);
                }
                else{
                    System.out.println("Please Try Again!");
                    inp = get_user_input();
                    init(inp);  
                }
            } catch (Exception e) {
                System.out.println("Sorry Try Again");
            }
        }
    }

    protected void init(int inp){
        if (inp == 1){
            System.out.println("yes");
        }
        else if (inp == 2){

        }
        else if (inp == 3){
            close();
        }
        else{
            System.out.println("Please Enter Number!");
        }
    }

    protected void get_user_info(){

    }

    public void display_user_info(){

    }

    public int get_user_input(){
        try {
            System.out.print("->>> ");
            int inp = input.nextInt();
            if (input.hasNextInt()){
                return -1;
            }
            else{
                return inp;
            }
        } catch (Exception e) {
            run = false;
            run();
        }
        return -1;
    }

    public  void call_valut(){

    }

    public  void call_setting(){

    }

    public  void close(){
        System.exit(0);
    }
}
