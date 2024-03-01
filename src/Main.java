import operands.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculate();
    }

     public static void calculate() {
        //Loop function for the whole program
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println(" ");
            System.out.println("Please input the number for the corresponding operation:");
            System.out.println("Add: 1, Sub: 2, Mul: 3, Div: 4");
            System.out.println("To exit, type 5");
            int operand = scan.nextInt();
            switch (operand) {
                case 1 -> new Add(scan).performOperation();
                case 2 -> new Subtract(scan).performOperation();
                case 3 -> new Multiply(scan).performOperation();
                case 4 -> new Division(scan).performOperation();
                case 5 -> loop = false;
                default -> System.out.println("Invalid operation, please try again");
            }
            if (!loop) {
                scan.close();
                break;
            }
        }
    }
}