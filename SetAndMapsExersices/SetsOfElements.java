package JavaAdvanced.DefiningClasesExercises.SetAndMapsExersices;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] setSizes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = setSizes[0];

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(scanner.nextLine());
        }

        int secondSetSize = setSizes[1];
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scanner.nextLine());
        }

        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
