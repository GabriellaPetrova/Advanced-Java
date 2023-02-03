package JavaAdvanced.DefiningClasesExercises.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , LinkedHashMap <String, Double>> shops = new TreeMap<>();

        String[] input  = scanner.nextLine().split(", ");

        while(!input[0].equals("Revision")) {

            String shop =input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product,price);

            input = scanner.nextLine().split(", ");
        }

        shops.forEach((shop, productsAndPrice) -> {
            System.out.println(shop + "->");
            productsAndPrice.forEach((product, price) -> System.out.printf("Product: %s, Price: %.1f%n", product, price));
        });
    }
}
