package JavaAdvanced.DefiningClasesExercises.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if(number == 0) {
            System.out.println(0);
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number /= 2;
            }
        }
        for (Integer integer : stack) {
            System.out.print(integer);
        }
    }
}


