package company;

public class Program {

    public static void main(String[] args){

        //Create a mobile and an employee
        MobilePhone mp = new MobilePhone("688733200", 94);
        Employee emp = new Employee("49577319Z", 57.42, mp);

        //Display the information about the employee
        System.out.println(emp.toString());

        //Make the employee work twice
        emp.work();
        emp.work();

        System.out.println();

        //Display the information about the employee again
        System.out.println(emp.toString());
    }
}
