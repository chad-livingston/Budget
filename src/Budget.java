import java.util.Locale;
import java.util.Scanner;

public class Budget {
    public static Scanner in;
    public static Boolean running = true;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Welcome to the budget app.");
        System.out.println("\" budget \" - use this to view your current budget.");
        System.out.println("\" settings \" - use this to modify your fixed expenses, income, etc.");

        while (running) {
            switch(in.nextLine().toLowerCase()){
                case "budget":
                    break;
                case "settings":
                    System.out.println("Settings sections:");
                    Settings settings = new Settings();
                    break;
                case "exit":
                    System.out.println("Closing the budgeting app.");
                    running = false;
                    in.close();
                    break;
                default:
                    System.out.println("Unable to determine where you wanted to go. Please try entering your command again.");
                    break;
            }


        }

    }
}
