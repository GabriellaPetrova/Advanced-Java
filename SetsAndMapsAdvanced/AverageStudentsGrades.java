package JavaAdvanced.DefiningClasesExercises.SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {

            String[] student = scanner.nextLine().split("\\s+");

            String name = student[0];
            double grades = Double.parseDouble(student[1]);

            studentsGrades.putIfAbsent(name, new ArrayList<>());
            studentsGrades.get(name).add(grades);
        }

        studentsGrades. forEach((key, value) -> {
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }
            double averGrade = sum /value.size(); // value.size , because divide by the number of grades

            System.out.println(key +
                    " -> " +
                    value.stream().map(x -> String.format("%.2f", x)).collect(Collectors.joining(" ")) +
                    " (avg: " +
                    String.format("%.2f", averGrade) +
                    ")");
        });
    }
}
