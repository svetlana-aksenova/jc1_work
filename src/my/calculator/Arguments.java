package my.calculator;

public class Arguments {

     int num1;
     int num2;
     String operation;

    public Arguments(int firstNumber, String operation, int secondNumber) {//передача значения через конструктор
        this.num1= firstNumber;
        this.operation= operation;
        this.num2= secondNumber;
    }
}
