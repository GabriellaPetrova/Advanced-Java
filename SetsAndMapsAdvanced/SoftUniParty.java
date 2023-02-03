package JavaAdvanced.DefiningClasesExercises.SetsAndMapsAdvanced;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> reservation = new TreeSet<>();
        //    Set<String> regular = new LinkedHashSet<>();

        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")) {


            reservation.add(reservationNumber);


            reservationNumber = scanner.nextLine();
        }
        String guestReservation = scanner.nextLine();
        while (!guestReservation.equals("END")) {
            reservation.remove(guestReservation);


            guestReservation = scanner.nextLine();
        }

        System.out.println(reservation.size());
        System.out.println(String.join(System.lineSeparator(), reservation));
    }
}

