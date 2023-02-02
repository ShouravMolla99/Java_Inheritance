package inheritance_private_input;

public class Teacher extends Person {

    private String qualification;
    private long contact;

    //Apply getter and setter method

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void displayAllItems(){
        System.out.println("Name is: "+getName());
        System.out.println("Designation: "+getDesignation());
        System.out.println("Age is: "+getAge());
        System.out.println("Amount of Salary: "+getSalary());
        System.out.println("Qualification: "+getQualification());
        System.out.println("Contact is: "+getContact());
    }
}
