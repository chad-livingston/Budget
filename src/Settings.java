public class Settings {
    private double budget;
    private String budgetLeftInterval;


    public Settings(){
        this.budget = 4000;
        this.budgetLeftInterval = "daily";
    }

    public double getBudget() {
        return budget;
    }
    public void setBudget(double budgetVal){
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
