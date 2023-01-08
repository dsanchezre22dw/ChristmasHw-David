package company;

public class Employee extends Person{

    private double money;
    private MobilePhone mp;

    public Employee(String name, String dni, int height, int weight, double money, MobilePhone mp){
        super(name, dni, height, weight);
        this.money = money;
        this.mp = mp;
    }

    public Employee(String name, String dni, int height, int weight, MobilePhone mp){
        super(name, dni, height, weight);
        this.money = 0;
        this.mp = mp;
    }

    public Employee(String dni, double money, MobilePhone mp){
        super(dni);
        this.money = money;
        this.mp = mp;
    }



    public void earnMoney(double amount){
        this.money += amount;
    }

    /*I have supposed that an employee can have debts (can spend money even if he will have negative money or
     if he already has negative money)
    if not, we should check if the employee has more money than what he will spend, or whether he has money
    (in case he can have negative money but cannot spend in negative money)
    */
    public void spendMoney(double amount){
        this.money -= amount;
    }

    public void work(){
        if (this.mp.getBattery() > 0){
            this.mp.use();
            this.earnMoney(10);
        }
    }

    public MobilePhone getMp(){
        return this.mp;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMoney: " + this.money + "€\nMobile phone battery: " + this.mp.getBattery() + "%";
    }







}
