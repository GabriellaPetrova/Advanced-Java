package JavaAdvanced.DefiningClasesExercises.SetAndMapsExersices;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            symbolMap.putIfAbsent(currentChar, 0);
            symbolMap.put(currentChar, symbolMap.get(currentChar)+ 1); // +1 broi ako ima povtarqshti se i gi dobavq kym mapa
        }

        symbolMap.forEach((k,v)-> System.out.printf("%s: %d time/s%n",k ,v));
    }
}
