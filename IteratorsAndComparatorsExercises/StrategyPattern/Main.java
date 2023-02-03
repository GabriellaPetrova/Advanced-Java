package JavaAdvanced.DefiningClasesExercises.IteratorsAndComparatorsExercises.StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<Person> peopleByName = new TreeSet<>(new PersonCompareLengthName());
        Set<Person> peopleByAge = new TreeSet<>(new PersonCompareAge());

        while (number-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person personToAdd = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleByAge.add(personToAdd);
            peopleByName.add(personToAdd);
        }
        peopleByName.forEach(System.out::println);
        peopleByAge.forEach(System.out::println);
    }
}
