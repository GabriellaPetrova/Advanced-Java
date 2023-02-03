package JavaAdvanced.DefiningClasesExercises.IteratorsAndComparatorsExercises.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        List<Person> people = new ArrayList<>();

        while (!"END".equals(command = scanner.nextLine())) {
            String[] tokens = command.split("\\s+");
            Person personToAdd = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            people.add(personToAdd);
        }
        int index = Integer.parseInt(scanner.nextLine())-1;
        Person personToCompare = people.get(index);
        long samePeople = people.stream().filter(person -> person.compareTo(personToCompare)==0).count();
        if(samePeople==1){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, people.size()-samePeople, people.size());
        }
    }
}
