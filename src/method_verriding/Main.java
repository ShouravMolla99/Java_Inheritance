package method_verriding;

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.name = "Salman";
        em.age = 24;
        em.designation = "Senior Developer";

        em.displayInfo();
    }
}
