import java.util.Locale;
import java.util.Scanner;

public class Budget {
    public static Scanner in;
    //main program loop for continuous runtime
    public static Boolean running = true;
    //settings
    public static Settings settings = new Settings();
    //expenses list creation
    public static Expenses expenses = new Expenses();

    //creates ID to assign to transaction....  needs to be pulled from file eventually.
    public static int idCount = 0;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Welcome to the budget app.");
        System.out.println("\"budget\" - use this to view your current budget.");
        System.out.println("\"settings\" - use this to modify your fixed expenses, income, etc.");

        while (running) {
            switch (in.nextLine().toLowerCase()) {
                case "budget":
                    System.out.println("Budget section");
                    System.out.println(settings);
                    //budget module continuous runtime loop
                    boolean budgetMod = true;
                    while (budgetMod) {
                        switch (in.nextLine().toLowerCase()) {
                            case "addtrans":
                                System.out.println("Name of transaction?");
                                String userTransName = in.nextLine().toLowerCase();
                                System.out.println("Cost of the transaction?");
                                Double userTransCost = Double.valueOf(in.nextLine());
                                System.out.println("Transaction type?\n" +
                                        "r - use this to make a recurring transaction.\n" +
                                        "Enter to make a variable transaction.");
                                String userTransType = in.nextLine().toLowerCase();
                                if(userTransType.equals("")){
                                    userTransType = "variable";
                                } else {
                                    userTransType = "recurring";
                                }
                                if (expenses.expenseListSize() == 0){
                                    idCount = 0;
                                } else {
                                    idCount = idCount + 1;
                                }
                                System.out.println("Adding " +
                                        userTransName +
                                        " for the amount of " +
                                        userTransCost +
                                        " Type="+userTransType +
                                        " ID=" +idCount);
                                expenses.addExpense(idCount, userTransName, userTransCost, userTransType);
                                break;
                            case "rmvtrans":
                                System.out.println("Remove last or by ID?");
                                String userRemovalPromptAnswer = in.nextLine().toLowerCase();
                                if (userRemovalPromptAnswer.equals("last")){
                                    expenses.removeLastExpense();
                                }
                                if (userRemovalPromptAnswer.equals("id")){
                                    System.out.println(expenses);
                                    System.out.println("Which ID would you like to remove?");
                                    Integer userIdToRemove = Integer.valueOf(in.nextLine());
                                    expenses.removeSpecificTransaction(userIdToRemove);
                                }
                                break;
                            case "viewtrans":
                                System.out.println(expenses);
                                break;
                            case "clear":
                                System.out.println("Are you sure you want to clear the list of transactions? y to confirm");
                                String userConfirmClear = in.nextLine().toLowerCase();
                                if(userConfirmClear.equals("y")){
                                    expenses.clearList();
                                    System.out.println("The transactions have been cleared.");
                                } else{
                                    System.out.println("Not removing any transactions.  If you really want to clear all the transactions, type clear then type y to confirm.");
                                }
                                break;
                            case "exit":
                                budgetMod = false;
                                printMainMenu();
                                break;
                            default:
                                System.out.println("Unable to determine what you wanted to do. Please try again.");
                                printBudgetMenu();
                                break;
                        }
                    }
                    break;
                case "settings":
                    System.out.println("Settings section");

                    System.out.println(settings);
                    System.out.println("What would you like to edit? \n"
                            + "budget \n"
                            + "interval");
                    Boolean editSetting = true;
                    while (editSetting) {
                        switch (in.nextLine().toLowerCase()) {
                            case "budget":
                                System.out.println("What would you like to set your maximum income too?");
                                double userBudgetVal = Double.valueOf(in.nextLine().toLowerCase());
                                settings.setBudget(userBudgetVal);
                                System.out.println("Your new budget has been set.\n"
                                        + "Budget: " + settings.getBudget());
                                break;
                            case "interval":
                                break;
                            case "exit":
                                editSetting = false;
                                printMainMenu();
                                break;
                            default:
                                System.out.println("You can only edit the budget or interval.  You can close this by typing exit.");
                                break;

                        }
                    }
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

    private static void printBudgetMenu() {
        System.out.println("Budget menu:\n" +
                "addtrans\n" +
                "rmvtrans\n" +
                "exit\n" +
                "What would you like to do?");
    }

    public static void printMainMenu() {
        System.out.println("Main menu:\n" +
                "budget\n" +
                "settings\n" +
                "exit\n" +
                "What would you like to do?");
    }
}
