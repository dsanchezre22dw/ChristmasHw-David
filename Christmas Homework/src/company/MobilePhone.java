package company;

public class MobilePhone {

    private String number;
    private int battery;

    public MobilePhone(String number, int battery){
        this.number = number;
        this.battery = battery;
    }

    public void use(){
        if (this.battery > 0){
            this.battery--;
        }
    }

    public int getBattery(){
        return this.battery;
    }



}
