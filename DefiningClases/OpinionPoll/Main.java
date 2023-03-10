package DefiningClases.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        while (line-- > 0){
            String[] token = scanner.nextLine().split("\\s+");
            Person singlePeople = new Person(token[0], Integer.parseInt(token[1]));
            people.add(singlePeople);
        }
        people.stream().filter(s -> s.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
