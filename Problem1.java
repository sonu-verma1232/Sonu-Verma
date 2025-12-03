import java.util.*;

public class Problem1 {
    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return -1;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operationType = sc.next().toLowerCase(); // directly read operation

        if (operationType.equals("add")) {
            System.out.println(add(a, b));
        } else if (operationType.equals("subtract")) {
            System.out.println(subtract(a, b));
        } else if (operationType.equals("multiply")) {
            System.out.println(multiply(a, b));
        } else if (operationType.equals("divide")) {
            System.out.println(divide(a, b));
        } else {
            System.out.println("Invalid operation");
        }

        sc.close();
    }
}
