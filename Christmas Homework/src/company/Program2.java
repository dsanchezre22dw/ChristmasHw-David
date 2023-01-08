package company;

public class Program2 {

    public static void main(String[] args){

        //Create the mobile phones of employees
        MobilePhone mp1 = new MobilePhone("688733200", 94);
        MobilePhone mp2 = new MobilePhone("685797172", 1);

        //Create 2 employees
        Employee emp1 = new Employee("David", "49577319Z", 181, 80, 57.42, mp1);
        Employee emp2 = new Employee("44143810W", 592.3 , mp2);

        //Create a company with one of the employees we have just created
        Company comp = new Company("BurgerKing", 1254.78, emp1);

        //Hire the manager (the other employee)
        comp.hireManager(emp2);

        //Show the data of the company
        System.out.println(comp.toString());

        //Make the company work twice
        comp.work();
        comp.work();

        System.out.println();

        //Show the data of the company again
        System.out.println(comp.toString());

    }



}
