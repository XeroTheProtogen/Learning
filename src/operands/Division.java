package operands;

import java.util.Arrays;
import java.util.Scanner;

public class Division implements BasicActions {
    private final Float[] numbers;

    public Division(Scanner scanner) {
        this.numbers = getNumbers("Division", scanner);
    }

    @Override
    public void performOperation() {
        //Not initializing to 0, everyone knows that n * 0 = 0
        float result = numbers[0];
        boolean zero = Arrays.stream(numbers).anyMatch(x -> x == 0);
        if (zero) {
            System.out.println("The result is 0, due to N / 0 = undefined");
        } else {
            for (float number : Arrays.copyOfRange(numbers, 1, numbers.length)) {
                result /= number;
            }
            System.out.println("The result of the division is " + result);
        }
    }
}
