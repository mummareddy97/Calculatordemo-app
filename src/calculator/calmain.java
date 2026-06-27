package calculator;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Addition = " + cal.add(20,10));

        System.out.println("Subtraction = " + cal.subtract(20,10));

        System.out.println("Multiplication = " + cal.multiply(20,10));

        System.out.println("Division = " + cal.divide(20,10));

    }

}
