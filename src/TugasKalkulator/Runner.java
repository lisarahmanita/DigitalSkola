package TugasKalkulator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1, number2, result;
        char operator;

        System.out.println("\n=== Calculator ===");

        System.out.println("Enter First Number: ");
        number1 = input.nextFloat();

        System.out.println("Enter Second Number: ");
        number2 = input.nextFloat();

        System.out.println("Enter Operator (+, -, *, /, %): ");
        operator = input.next().charAt(0);

        Calculator calculator = new Calculator(number1, number2, operator);
        result = (float) calculator.calculate();

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

    }
}
