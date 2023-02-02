package inheritance_private_input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Creating Object of teacher class
        Teacher t1 = new Teacher();

        //Input From user for Name
        Scanner n = new Scanner(System.in);
        System.out.print("Enter The Name: ");
        t1.setName(n.nextLine());

        //Input From user for Designation
        Scanner d = new Scanner(System.in);
        System.out.print("Enter Designation: ");
        t1.setDesignation(d.nextLine());

        //Input From user for Age
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Age: ");
        t1.setAge(a.nextInt());


        //Input From user for Salary
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Amount of Salary: ");
        t1.setSalary(s.nextInt());


        //Input From user for Qualification
        Scanner q = new Scanner(System.in);
        System.out.print("Enter Qualification: ");
        t1.setQualification(q.nextLine());


        //Input From user for Contact
        Scanner c = new Scanner(System.in);
        System.out.print("Enter Contact Number: ");
        t1.setContact(c.nextLong());

        //Method Calling
        t1.displayAllItems();
    }

}
