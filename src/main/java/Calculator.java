

import java.util.Scanner;

public class Calculator{
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input number A");
        int A = scanner.nextInt();
        System.out.println("Input number B");
        int B = scanner.nextInt();
        System.out.println("Choose operation +, -, *, /");
        String operation = new String();
        operation = scanner.next();
        switch(operation) {
            case "+":
                System.out.println(Calculator.Sum(A, B));
                break;
            case "-":
                System.out.println(Calculator.Subtraction(A, B));
                break;
            case "*":
                Calculator.Multiplication(A, B);
                break;
            case "/":
                Calculator.Division(A, B);
                break;
        }
    }

    public static double Division(int A, int B) {
        System.out.println("Result division " + (double) A / B);
        return A / B;
    }

    public static int Multiplication(int A, int B) {
        System.out.println("Result multiplication " + (A * B));
        return A * B;

    }

    public static int Subtraction(int A, int B) {
        System.out.println("Result subtraction " + (A - B));
        return (A - B);
    }

    public static int Sum(int A, int B) {
        System.out.println("Result add " + (A + B));
        return (A + B);
    }
}
