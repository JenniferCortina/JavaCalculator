import java.util.*;


public class Calculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");

        /* The user will be able to enter an integer and floating point
        since the double data type is being used
         */
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            /* If the user enters another operator or char apart from
             * +, -, * and /, then the user will see an error message
             *
             */
            default:
                System.out.printf("Oh no! You have entered a wrong operator. Please try again.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
    }
}
