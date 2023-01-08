package Saloon_exercise;


import java.util.Date;
public class Salon {

    private Client[] clients;
    private Visit[] visits;
    private int numClients;
    private int numVisits;


    public Salon(int maxNumClients, int maxNumVisits){
        this.clients = new Client[maxNumClients];
        this.visits = new Visit[maxNumVisits];
        int numClients = 0;
        int numVisits = 0;
    }

    public Client getClient(String ID){
        for (int i = 0; i < this.numClients; i++){
            if (this.clients[i].getID().equals(ID)){
                return this.clients[i];
            }
        }
        return null;
    }

    public void addClient(Client client){
        if (this.numClients < this.clients.length){
            this.clients[this.numClients] = client;
            this.numClients++;
        }else{
            System.out.println("You cannot add more clients");
        }
    }

    public void unsuscribeClient(String ID){
        if (this.getClient(ID) != null){
            this.getClient(ID).setMember(false);
            this.getClient(ID).setTier(null);
        }else{
            System.out.println("This client does not exist");
        }
    }

    public void setMembershipClient(String ID, String tier){
        if (this.getClient(ID) != null){
            this.getClient(ID).setMember(true);
            this.getClient(ID).setTier(tier);
        }else{
            System.out.println("This client does not exist");
        }
    }

    public void addVisit(String ID, Date date){
        if (this.getClient(ID) != null){
            if (this.numVisits < this.visits.length){
                Visit visit = new Visit(this.getClient(ID), date);
                this.visits[this.numVisits] = visit;
                this.numVisits++;
            }else{
                System.out.println("You cannot add more visits");
            }
        }else{
            System.out.println("This client does not exist");
        }
    }

    public Visit[] getClientVisits(String ID){
        int i;
        if (this.getClient(ID) != null){
            int numClientVisits = 0;
            for (i = 0; i < this.numVisits; i++){
                if (this.visits[i].getClient().getID().equals(ID)){
                    numClientVisits++;
                }
            }

            Visit[] clientVisits = new Visit[numClientVisits];
            int j = 0;
            for (i = 0; i < this.numVisits; i++){
                if (this.visits[i].getClient().getID().equals(ID)){
                    clientVisits[j] = this.visits[i];
                    j++;
                }
            }

            return clientVisits;

        }else{
            System.out.println("This client does not exist");
            return null;
        }
    }

    public void showClients(){
        for (int i = 0; i < numClients; i++){
            System.out.println(this.clients[i].toString() + "\n");
        }
    }

    public void showVisits(){
        for (int i = 0; i < numVisits; i++){
            System.out.println(this.visits[i].toString() + "\n");
        }
    }

    public Visit[] getVisits() {
        return this.visits;
    }

    public int getNumVisits(){
        return this.numVisits;
    }
}
