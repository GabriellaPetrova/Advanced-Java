package JavaAdvanced.DefiningClasesExercises.SetAndMapsExersices;

import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < numberOfNames; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}