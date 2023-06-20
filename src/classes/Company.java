package classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.age = 15;
        employee1.name = "Jan";
        employee1.surname = "Kowalski";

        Employee employee2 = new Employee();
        employee2.age = 80;
        employee2.name = "Agata";
        employee2.surname = "Nowak";

        System.out.println(employee1.name + " " + employee1.surname + " " + employee1.age + " lat");
        System.out.printf("%s %s %d lat\n", employee1.name, employee1.surname, employee1.age);
        System.out.printf("Kobieta o imieniu %s %s ma %d lat", employee2.name, employee2.surname, employee2.age);
        // %s - String
        // %d - int
        // %f - double
    }
}
