package JavaAdvanced.DefiningClasesExercises.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        int counter = 0;

        for (int i = 0; i < children.length; i++) {
            queue.offer(children[i]);
        }

        while(queue.size() > 1 ) {
            for (int i = 0; i < n; i++) {
                queue.offer(queue.poll());
            }
            counter++;

            if(!isPrime(counter)) {
                System.out.println("Remove " + queue.poll());
            } else {
                System.out.println("Prime " + queue.peek());
            }
            System.out.println("Last is " + queue.poll());

        }
    }

    private static boolean isPrime(int inputNumber) {
        if(inputNumber <= 1) {
            return false;
        } else {
            for (int i = 2; i <= inputNumber/2; i++) {
                if((inputNumber % i) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
