public class Transaction {
    private String transactionName;
    private double transactionCost;
    private String transactionType;


    public Transaction(String name, double cost, String type){
        this.transactionName = name;
        this.transactionCost = cost;
        this.transactionType = type;
    }

}
