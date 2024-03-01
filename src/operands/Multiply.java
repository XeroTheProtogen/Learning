package operands;

import java.util.Arrays;
import java.util.Scanner;

public class Multiply implements BasicActions {
    private final Float[] numbers;
    public Multiply(Scanner scanner) {
        this.numbers = getNumbers("multiplication", scanner);
    }

    @Override
    public void performOperation() {
        //Not initializing to 0, everyone knows that n * 0 = 0
        float result = numbers[0];
        boolean zero = Arrays.stream(numbers).anyMatch(x -> x == 0);
        if (zero) {
            System.out.println("The result is 0, due to N * 0 = 0");
        } else {
            for (float number : Arrays.copyOfRange(numbers, 1, numbers.length)) {
                result *= number;
            }
            System.out.println("The result of the multiplication is " + result);
        }
    }
}
