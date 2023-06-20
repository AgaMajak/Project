package exersise;

public class Variables {
    public static void main(String[] args) {
        //zmienna_typ nazwa;
        //String, int, double, boolean
        System.out.println("Ala ma " + 2 + " koty");
        System.out.println("Ala ma " + 15 + " lat");

        //lowerCamelCase
        //deklaracja zmiennej
        String firstName1;
        //inicjalizacja zmiennej
        firstName1 = "Ola";
        String lastName = "Kowalska";
        int age = 15;
        int catNumber = 2;
        double height = 1.7;
        boolean isAdult = false;

        height = 1.9;

        System.out.println(firstName1 + " ma " + catNumber + " koty");

        String firstName2 = "Ala";
        System.out.println(firstName1 + " ma " + age + " lat");

        String firstName3 = "Michał";
        System.out.println(firstName2);

        final String pesel = "99999910000";

        //zmienna var
        var text = "Jakiś tekst";
        var number = 21;

    }
}
