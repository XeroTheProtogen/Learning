package operands;

import java.util.Arrays;
import java.util.Scanner;

public class Subtract implements BasicActions {
    private final Float[] numbers;
    public Subtract(Scanner scanner) {
        this.numbers = getNumbers("Subtraction", scanner);
    }

    @Override
    public void performOperation() {
        //Initialize results with the first entry in numbers
        float result = numbers[0];
        //Exclude the first number of the array from the for loop
        for (float number : Arrays.copyOfRange(numbers, 1, numbers.length)) {
            //Subtract from results
            result -= number;
        }
        //Provide the result of the operation to the user
        System.out.println("The result of the subtraction is " + result);
    }
}
