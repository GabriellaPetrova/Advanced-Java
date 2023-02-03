package JavaAdvanced.DefiningClasesExercises.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String>  browser = new ArrayDeque<>();

        String line = scanner.nextLine();
        String currentPage = "";

        while(!line.equals("Home")) {
            if(line.equals("back")) {
                if(!browser.isEmpty()) {
                currentPage = browser.pop();
            } else {
                System.out.println("no previous URLs");
                line = scanner.nextLine();
                continue;
            }

        } else  {
                if(!currentPage.equals("")) {
                    browser.push(currentPage);
                }
                currentPage = line;
            }
            System.out.println(currentPage);
            line = scanner.nextLine();
        }
    }
}

