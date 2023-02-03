package JavaAdvanced.DefiningClasesExercises.GenericsExcercises.GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Box<Double> boxList = new Box<>();
        while (number-- > 0){
            double boxToAdd = Double.parseDouble(scanner.nextLine());
            boxList.add(boxToAdd);
        }
        double elementToCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(boxList.Compare(elementToCompare));
    }
}
