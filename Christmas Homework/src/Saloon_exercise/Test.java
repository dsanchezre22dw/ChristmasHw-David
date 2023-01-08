package Saloon_exercise;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //Create the salon with a maximum of 10 clients (with a random maximum of visits)
        Salon sal = new Salon(10, 10);

        //Create 3 clients, of which only 1 is a member
        Client cl1 = new Client("David", "2912D", true, "Platinum");
        Client cl2 = new Client("Mikel", "1506M");
        Client cl3 = new Client("Ruben", "0507R");

        //Add this 3 clients to the salon
        sal.addClient(cl1);
        sal.addClient(cl2);
        sal.addClient(cl3);

        //Convert the 2 clients that are not members into members (premium and gold)
        sal.setMembershipClient(cl2.getID(), "Premium");
        sal.setMembershipClient(cl3.getID(), "Gold");

        //Add a visit to each client
        sal.addVisit(cl1.getID(), new Date(123,0,4, 19, 43, 12));
        sal.addVisit(cl2.getID(), new Date(121,2,12,22, 13, 45));
        sal.addVisit(cl3.getID(), new Date(122,11,28, 13, 37, 59));

        //Add the cost of the visit
        for (int i = 0; i < sal.getNumVisits(); i++){
            //random cost (100)
            sal.getVisits()[i].setCost(100);
        }

        //Show all the visits
        sal.showVisits();



    }
}