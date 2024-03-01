package operands;

import java.util.Scanner;

public class Add implements BasicActions {
    private final Float[] numbers;
    public Add(Scanner scanner) {
        this.numbers = getNumbers("addition", scanner);
    }

    @Override
    public void performOperation() {
        //Initialize result as 0
        float result = 0;
        for (float number : this.numbers) {
            //Add each number from the numbers array to the result
            result += number;
        }
        //Provide the result of the operation
        System.out.println("The sum of all of the inputted numbers is " + result);
    }
}
