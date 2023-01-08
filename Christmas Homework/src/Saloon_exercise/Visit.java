package Saloon_exercise;

import java.util.Date;
public class Visit {

    private Client client;
    private Date date;
    private double cost;

    public Visit(Client client, Date date){
        this.client = client;
        this.date = date;
        this.cost = 0;
    }

    public Client getClient(){
        return this.client;
    }

    public Date getDate(){
        return this.date;
    }

    public double getCost(){
        return this.cost;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setCost(double amount){
        this.cost = amount - amount * this.client.getDiscount();
    }

    @Override
    public String toString(){
        return "Visit {\n" + this.client.toString() + "\nDate: " + this.date + "\nCost: " + this.cost + "€\n}";

    }


}
