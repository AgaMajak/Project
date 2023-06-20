package objective;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();

        cat.age = 2;
        cat.height = 30;
        cat.weight = 5.5;
        cat.name = "Kotek";


        System.out.println("Kot:");
        System.out.println("Waga: " + cat.weight);
        System.out.println("Imię: " + cat.name);
    }
}
