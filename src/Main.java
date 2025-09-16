//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo
        int intOperandA = 5;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 1;
        int intQuotient = 6;
        int intModulo = 7;
        //doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference, doubleQuotient
        double doubleOperandA = 5.0;
        double doubleOperandB = 2.0;
        double doubleSum = 3.0;
        double doubleProduct = 4.0;
        double doubleDifference = 1.0;
        double doubleQuotient = 6.0;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        intProduct = intOperandA * intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference between " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference between " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient of " +  doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        //the number of kids in your family: the answer to is it raining?: the price of a gallon of gas:
        // your favorite number: your shoe size: your birth month: your full name:\
        int kidsInMyFamily = 4;
        boolean isRaining = false;
        double gasPrice = 3.17;
        double myFavoriteNumber = 3.1415926939897932382646238832795028841971693993751058209749445923078064062862089986280348253421170679;
        //yes that was purely from memory
        double myShoeSize = 8.5;
        int myBirthMonth = 11;
        String myBirthMonthName = "November";
        String myName = "Em Marie Hunter";
        System.out.println("My name is " + myName + " and I was born in " + myBirthMonthName + ".");
    }
}