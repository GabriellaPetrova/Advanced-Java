package JavaAdvanced.DefiningClasesExercises.GenericsExcercises.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number-- > 0) {
            Box<String> box = new Box<>(scanner.nextLine());
            System.out.println(box);
        }
    }
}
