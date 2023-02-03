package JavaAdvanced.DefiningClasesExercises.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while(!input.equals("END")) {
            String[] commandAttribute = input.split(",\\s+");
            String carNumber = commandAttribute[1];

            switch(commandAttribute[0]) {
                case "IN":
                    parkingLot.add(carNumber);
                    break;
                case "OUT":
                    parkingLot.remove(carNumber);
                    break;
                    }
            input = scanner.nextLine();
        }
        if(parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingLot) {
                System.out.println(car);

            }
        }
    }
}