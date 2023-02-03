package DefiningClases.CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Hierarchy> catCatalog = new HashMap<>();
        String inputLine;
        while (!"End".equals(inputLine= scanner.nextLine())){
            String[] token = inputLine.split("\\s+");
            String name = token[1];
            double parameter = Double.parseDouble(token[2]);

            switch (token[0]){
                case "Siamese":
                    catCatalog.putIfAbsent(name, new Siamese(name,parameter));
                    break;
                case "Cymric":
                    catCatalog.putIfAbsent(name, new Cymric(name,parameter));
                    break;
                case "StreetExtraordinaire":
                    catCatalog.putIfAbsent(name, new StreetExtraordinaire(name,parameter));
                    break;
            }
        }
        String cat = scanner.nextLine();
        System.out.println(catCatalog.get(cat));
    }
}
