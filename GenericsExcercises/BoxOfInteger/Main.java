package JavaAdvanced.DefiningClasesExercises.GenericsExcercises.BoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number-- > 0){
            Box<Integer> box = new Box<>(Integer.parseInt(scanner.nextLine()));
            System.out.println(box);
        }
    }
}
