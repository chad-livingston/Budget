import java.util.ArrayList;

public class Expenses {
    private ArrayList<Transaction> expensesList;
    private Transaction transaction;

    public Expenses(){

    }

    public void addExpense(String name, double cost, String type){
        expensesList.add(new Transaction(name, cost, type));
    }



}
