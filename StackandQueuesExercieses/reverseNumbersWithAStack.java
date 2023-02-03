package JavaAdvanced.DefiningClasesExercises.StackandQueuesExercieses;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        ArrayDeque<Integer> reverseNumbers = new ArrayDeque<>();

        for (int i = 0; i < list.size(); i++) {
            reverseNumbers.push(list.get(i));
        }

        System.out.println(reverseNumbers.toString().replaceAll("[\\[\\],]",""));
    }
}
