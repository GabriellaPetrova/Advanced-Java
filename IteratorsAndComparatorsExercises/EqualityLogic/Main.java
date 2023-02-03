package JavaAdvanced.DefiningClasesExercises.IteratorsAndComparatorsExercises.EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<Person> peopleTree = new TreeSet<>();
        Set<Person> peopleHash = new HashSet<>();

        while (number-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person personToAdd = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleTree.add(personToAdd);
            peopleHash.add(personToAdd);
        }
        System.out.println(peopleTree.size());
        System.out.println(peopleHash.size());
    }
}
