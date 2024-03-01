package operands;

import java.util.Scanner;

public interface BasicActions {
    default Float[] getNumbers(String operand, Scanner scan) {
        // Ask for the amount of numbers the user wants to input
        System.out.println("How many numbers do you want to use for " + operand + "? Whole numbers only");
        int operationLength = scan.nextInt();
        // Set the array length to the specified amount
        Float[] numbers = new Float[operationLength];
        // Ask for each number to be used in the operation
        for (int i = 0; i < operationLength; i++) {
            //Switch statement for easier reading
            switch (i) {
                case 0 -> System.out.println("Please enter your first number");
                case 1 -> System.out.println("Please enter your second number");
                case 2 -> System.out.println("Please enter your third number");
                default -> System.out.println("Please enter your " + (i + 1) + "th number");
            }
            //Get the Nth number desired and add to numbers
            float number = scan.nextFloat();
            numbers[i] = number;
        }
        //Return array
        return numbers;
    }

    default void performOperation() {
        //Intended to be overridden, write your operation code here
    }
}
