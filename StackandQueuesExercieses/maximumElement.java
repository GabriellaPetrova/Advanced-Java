package JavaAdvanced.DefiningClasesExercises.StackandQueuesExercieses;

import java.util.*;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommand = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommand; i++) {

            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            switch (command) {
                case "1":
                    int number = Integer.parseInt(input[1]);
                    stack.push(number);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    if (stack.isEmpty()) {
                        System.out.println(0);
                    } else {
                        System.out.println(Collections.max(stack));
                    }
                    break;
            }
        }
    }
}
