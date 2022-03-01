package my.calculator;

import Arguments.Arguments;
import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Arguments arguments = readArguments();

            doCalculation(arguments);
            checkExitOrContinue();


        }
    }

    private static void checkExitOrContinue() {
        System.out.println("Pleas enter [E]12 to exit or any key to continue");
        String command = scanner.next();
        if (command.equalsIgnoreCase("E")){
            System.exit(0);
    }

    private static  Arguments readArguments(){
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter operation: ");
        String operation = scanner.next();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        return new Arguments(firstNumber, operation, secondNumber);
    }
    private static void doCalculation(){
        BasicCalculator basicCalculator = new BasicCalculator();
        final double result =
                basicCalculator.calculate(args.num1, args.num2, args.operation.charAt(0));
        System.out.println("Resalt of " +
                args.num1+ args.operation.charAt(0) + args.num2 + " is " + result);

    }
}