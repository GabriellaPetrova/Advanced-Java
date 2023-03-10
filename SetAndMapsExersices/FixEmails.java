package JavaAdvanced.DefiningClasesExercises.SetAndMapsExersices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while(!name.equals("stop")) {
            String email = scanner.nextLine();

            if(!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }
        emails.forEach((k,v) -> System.out.printf("%s -> %s%n", k,v));
    }
}
