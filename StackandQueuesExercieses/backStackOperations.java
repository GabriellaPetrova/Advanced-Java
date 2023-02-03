package JavaAdvanced.DefiningClasesExercises.StackandQueuesExercieses;

import java.util.*;
import java.util.stream.Collectors;

public class backStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> operation = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int allElementsNumber = operation.get(0);
        int elementsToPop = operation.get(1);
        int elementsToCheck = operation.get(2);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < allElementsNumber; i++) {
            stack.push(numbers.get(i));
        }

        for (int i = 1; i <= elementsToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            if (stack.contains(elementsToCheck)) {
                System.out.println("true");
            } else {
                int smallest = Integer.MAX_VALUE;

                while (stack.size() > 0) {
                    int current = stack.pop();
                    if (current < smallest) {
                        smallest = current;
                    }
                }
                System.out.println(smallest);
            }
        }
    }
}
