package method_verriding;

public class Employee extends Person {

    String designation;

    //Method Overriding
    @Override
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
    }
}
