package company;

public class Person {

    private String name;
    private String dni;
    private int height;
    private int weight;

    public Person(String name, String dni, int height, int weight){
        this.name = name;
        this.dni = dni;
        this.height = height;
        this.weight = weight;
    }

    public Person(String dni){
        this(null, dni, 0, 0);
    }

    /* We do not need the getters and setters in this exercise, but since we have a constructor that only
        receives one parameter, it is recommendable to have them

    public String getName() {
        return this.name;
    }

    public String getDni() {
        return this.dni;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

     */

    @Override
    public String toString(){
        return "Name: " + this.name + "\nWeight: " + this.weight + "kg";
    }
}
