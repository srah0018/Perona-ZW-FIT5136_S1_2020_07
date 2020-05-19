import java.util.Scanner;

public class MissionToMars {

    public MissionToMars(){

    }

    public static void main(String ... args){
        main();
    }
    public static void main(){

        System.out.println("\t* Welcome to Mission to Mars! *");
        int a = acceptNumericInput("Enter 1 to login \nEnter 2 to register yourself as a candidate");
        switch(a) {
            case 1:
                boolean reDisplay = true;
                while(true) {
                    while(reDisplay) {
                        String pass = acceptStringInput("\n* Please enter your Username to login: *");
                        String input = acceptStringInput("* Password: *");
                        if (input.equals("admin")) {
                            reDisplay = admin();
                        }
                        else if (input.equals("coordinator")){
                            reDisplay = coordinator();
                        }
                        else if (input.equals("candidate")){
                            reDisplay = candidate();
                        }
                        else
                        {
                            System.out.println("* Please enter a valid Username *");
                        }
                    }

                    return;
                }
            case 2:
                register();
            default:
                System.out.println("* Please enter 1 or 2! *");
        }
    }

    private static void register() {

    }

    public static boolean admin(){
        displayAdmin();
        return false;
    }

    public static boolean coordinator(){
        displayCoo();
        return false;
    }

    public static boolean candidate(){
        displayCan();
        return false;
    }

    public static void displayAdmin() {
        System.out.println("\t* Hi Administrator! *\n*Kind reminder: You can exit by enter 999 at any step*\n\n* Please select from the following options: \n* Enter 1 to check the mission list \n* Enter 2 to view all shuttles\n* Enter 3 to see messages");
    }

    public static void displayCoo() {
        System.out.println("\t* Hi Coordinator! *\n* Kind reminder: You can exit by enter 999 at any step *\n\n* Please select from the following options: \n* Enter 1 to check the mission list \n* Enter 2 to create a new mission \n* Enter 3 to see messages");
    }

    public static void displayCan() {
        System.out.println("\t* Hi Coordinator! *\n*Kind reminder: You can exit by enter 999 at any step*\n\n* Please select from the following options: \n* Enter 1 to Edit profile \n* Enter 2 to see messages");
    }

    public static int acceptNumericInput(String displayMessage) {
        int value = 0;
        boolean check = true;

        do {
            System.out.println(displayMessage);
            Scanner input = new Scanner(System.in);

            try {
                value = input.nextInt();
                check = false;
            } catch (Exception var6) {
                System.out.println("Please give an integer.");
            }
        } while(check);

        return value;
    }

    public static String acceptStringInput(String displayMessage) {
        System.out.println(displayMessage);
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        return value;
    }

}
