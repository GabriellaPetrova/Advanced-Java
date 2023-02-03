package JavaAdvanced.DefiningClasesExercises.IteratorsAndComparatorsExercises.Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        Lake lake = new Lake();

        while (!"END".equals(command = scanner.nextLine())) {
            int[] tokens = Arrays.stream(command.split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            for (Integer token : tokens) {
                lake.addLast(token);
            }
        }
        Lake.print(lake);
    }
}
