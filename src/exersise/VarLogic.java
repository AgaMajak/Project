package exersise;

public class VarLogic {

    public static void main(String[] args) {
        //operator przyrównania
        // ==
        // !=

        int number1 = 10;
        int number2 = 5;

        boolean result1 = (number1 != number2);
        System.out.println(result1);

        boolean result2 = (number1 == number2);
        System.out.println(result2);

        //koniunkcja czyli "i" "oraz"
        // &&

        boolean result3 = result1 && result2; // true && false
        System.out.println(result3);

        //alternatywa czyli "lub"
        // ||
        boolean result4 = result1 || result2; //true || false
        System.out.println(result4);
    }
}
