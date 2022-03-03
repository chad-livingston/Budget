import java.util.ArrayList;

public class Expenses {
    private ArrayList<Transaction> expensesList;
    private Transaction transaction;

    public Expenses(){
        expensesList = new ArrayList<>();
    }

    public void addExpense(Integer id, String name, double cost, String type){
        //this.transaction = new Transaction(name,cost,type);
        this.expensesList.add(new Transaction(id, name, cost, type));
    }

    public void removeLastExpense(){
        expensesList.remove(expensesList.size()-1);
    }
    public void removeSpecificTransaction(Integer id){
        expensesList.remove(id);
    }
    public void clearList(){
        this.expensesList.clear();
    }
    public int expenseListSize(){
        return expensesList.size();
    }

    public String toString() {
        String transactions = "";
        for (Transaction transaction : expensesList){
            transactions += transaction;
        }
        return "Expense Listing:\n" + transactions;

    }
}
