// import java.util.Timer;
// import java.util.TimerTask;

class Main {
    // static Timer time = new Timer();

    public static void main(String[] args) throws Exception {
        // Messages messages = new Messages();
        // UserControl userControl = new UserControl();

        // messages.welcome();
        // time.schedule(new TimerTask() {
        //     @Override
        //     public void run(){
        //         clearScreen();
        //         userControl.run();
        //     }
        // }, 3000);
        DataBase db = new DataBase();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

