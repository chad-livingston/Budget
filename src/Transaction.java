public class Transaction {
    private Integer transactionID;
    private String transactionName;
    private double transactionCost;
    private String transactionType;


    public Transaction(Integer Id, String name, double cost, String type){
        this.transactionID = Id;
        this.transactionName = name;
        this.transactionCost = cost;
        this.transactionType = type;

    }

    public int getID(){
        return this.transactionID;
    }
    public double getTransactionCost(){
        return this.transactionCost;
    }
    public String getTransactionType(){
        return this.transactionType;
    }

    public String toString(){
        return "ID:" + this.transactionID + " " + this.transactionName + ":: " + this.transactionCost + " TYPE: " + this.transactionType + "\n";
    }


}
