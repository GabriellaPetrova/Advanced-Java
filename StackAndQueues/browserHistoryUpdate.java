package JavaAdvanced.DefiningClasesExercises.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backPages = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentPage = "";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!backPages.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardPages.push(currentPage);
                    currentPage = backPages.pop();
                    System.out.println(currentPage);
                }

            } else if (input.equals("forward")) {
                if (forwardPages.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    backPages.push(currentPage);
                    currentPage = forwardPages.pop();
                    System.out.println(currentPage);
                }

                } else {
                    if (!currentPage.equals("")) {
                        backPages.push(currentPage);
                    }
                    forwardPages.clear();
                    currentPage = input;
                    System.out.println(currentPage);
                }

                input = scanner.nextLine();
        }
    }
}


