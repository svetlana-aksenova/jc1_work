package my.calculator;

public class BasicCalculator {

    public double calculate(int firstNum, int secondNum, char operation) {
        //+ - * / %
        switch (operation) {
            case '+':{
                return sum(firstNum, secondNum);
        }
            case '-': {
                return diff(firstNum, secondNum);

            }
            case '*': {
                return multiply(firstNum, secondNum);
            }
            case '/':{
                return divide(firstNum, secondNum);
            }
            case '%': {
                return modul(firstNum, secondNum);
            }
            default:{
                System.out.println("Operation unknown");
            }
        }

        return 0.0;
    }


    private double sum(int num1, int num2) {
        return (double) num1 + num2;
    }

    private double diff(int num1, int num2) {
        return (double) num1 - num2;
    }

    private double multiply(int num1, int num2) {
        return (double) num1 * num2;
    }
    private double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
    private double modul(int num1, int num2) {
        return (double) num1 % num2;
    }
}