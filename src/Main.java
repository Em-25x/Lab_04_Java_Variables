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
    }
}