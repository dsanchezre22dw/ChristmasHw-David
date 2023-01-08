package Saloon_exercise;

public class Client {

    private String name;
    private String ID;
    private boolean member;
    private String tier;

    public Client(String name, String ID, boolean member, String tier){
        this.name = name;
        this.ID = ID;
        this.member = member;
        this.tier = tier;
    }

    public Client(String name, String ID){
        this(name, ID, false, null);
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }

    public boolean getMember(){
        return member;
    }

    public String getTier(){
        return tier;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public void setTier(String tier){
        this.tier = tier;
    }

    public double getDiscount(){
        if (this.member){
            if (this.tier.equals("Platinum")){
                return 0.1;
            }else if (this.tier.equals("Gold")){
                return 0.15;
            }else if (this.tier.equals("Premium")){
                return 0.2;
            }
        }

        return 0;
    }

    @Override
    public String toString(){
        String x = "Client{ \nName: " + this.name + "\nID: " + this.ID + "\nMembership: ";

        if (this.member){
            x += "YES\nTier: " + this.tier + "\n}";
        }else{
            x += "NO\n}";
        }

        return x;
    }




}
