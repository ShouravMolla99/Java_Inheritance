package inherit_private_member;

public class Teacher extends Person{

    String qualification;

    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public void displayItems(){
        System.out.println("Name is: "+getName());
        System.out.println("Age is: "+getAge());
        System.out.println("Qualification is: "+getQualification());
    }
}
