package JavaAdvanced.DefiningClasesExercises.StackandQueuesExercieses;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> operations = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

         int allElement = operations.get(0);
         int elementsToRemove = operations.get(1);
         int elementToCheck = operations.get(2);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < allElement; i++) {
            queue.offer(numbers.get(i));
        }

        for (int i = 0; i <= elementsToRemove ; i++) {
            queue.pop();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            if(queue.contains(elementToCheck)) {
                System.out.println("true");
            } else {
                int smallest = Integer.MAX_VALUE;

                while(queue.size() > 0 ){
                    int currentNum = queue.pop();
                    if(currentNum < smallest) {
                        smallest = currentNum;
                    }
                }
                System.out.println(smallest);
            }
        }
    }
}

