package inherit_private_member;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Shourav Molla");
        t1.setAge(24);
        t1.setQualification("Bsc. in CSE");

        t1.displayItems();

        Teacher t2 = new Teacher();
        t2.setName("Salman Molla");
        t2.setAge(25);
        t2.setQualification("Bsc. in CSE");

        t2.displayItems();

    }
}
