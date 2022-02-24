public class Settings {
    private int budget;
    private String budgetLeftInterval;


    public Settings(){
        this.budget = 4000;
        this.budgetLeftInterval = "daily";
    }

    public int getBudget() {
        return budget;
    }
    public void setBudget(int budgetVal){
        this.budget = budgetVal;
    }

    public String getBudgetLeftInterval() {
        return budgetLeftInterval;
    }
    public void setBudgetLeftInterval(String userInterval){
        this.budgetLeftInterval = userInterval;
    }
    public String toString(){

        return "Current Budget: " + this.budget + "\n"
                + "Current Interval: " + this.budgetLeftInterval + "\n"
                + "";

    }
}
