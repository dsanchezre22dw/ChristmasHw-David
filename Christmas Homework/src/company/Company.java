package company;

public class Company {

    private String name;
    private double profit;
    private Employee owner;
    private Employee manager;

    public Company(String name, double profit, Employee owner){
        this.name = name;
        this.profit = profit;
        this.owner = owner;
        this.manager = null;
    }

    public void hireManager(Employee manager){
        this.manager = manager;
    }


    public void work(){

        /*The profit of the company will only be increased by 100 if both the owner and the manager
          have been able to work
         */
        if (this.owner.getMp().getBattery() > 0 && this.manager.getMp().getBattery() > 0){
            this.profit += 100;
        }

        this.owner.work();
        this.manager.work();

    }

    @Override
    public String toString(){
        return "Name of the company: " + this.name + "\nProfit: " + this.profit + "€\nOwner: {\n" + this.owner.toString()
                + "\n}\nManager: {\n" + this.manager.toString() + "\n}";

    }
}
