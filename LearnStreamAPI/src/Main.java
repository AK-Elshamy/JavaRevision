import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Student> students = List.of(
                new Student("Ahmed", 21, "CS", List.of(85.0, 90.0, 78.0)),
                new Student("Sara", 22, "IT", List.of(92.0, 88.0, 95.0)),
                new Student("Mona", 20, "CS", List.of(70.0, 65.0, 80.0)),
                new Student("Ali", 23, "IT", List.of(60.0, 55.0, 70.0)),
                new Student("Omar", 21, "CS", List.of(95.0, 98.0, 92.0))
        );

        // task1

        List<String> cs = students.stream()
                .filter(s -> s.department().equals("CS"))
                .map(Student::name)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(cs);

        List<Student> collect = students.stream()
                .filter(s -> s.average() > 80)
                .sorted(Comparator.comparing(Student::average).reversed())
                .collect(Collectors.toList());

        System.out.println(collect);

        List<StudentSummaryDTO> collect1 = students.stream()
                .map(s -> new StudentSummaryDTO(s.name(), s.department(), s.average()))
                .collect(Collectors.toList());

        System.out.println(collect1);

        boolean it = students.stream()
                .filter(s -> s.department().equals("IT"))
                .allMatch(s -> s.average() > 70);

        System.out.println(it);

        Optional<Student> first = students.stream()
                .filter(s -> s.average() > 95)
                .findFirst();
        System.out.println(first.isPresent() ? first : "N/A");

        long cs1 = students.stream()
                .filter(s -> s.department().equals("CS"))
                .count();
        System.out.println(cs1);

        long it1 = students.stream()
                .filter(s -> s.department().equals("IT"))
                .count();
        System.out.println(it1);

        Optional<Student> best = students.stream()
                .max(Comparator.comparing(Student::average));
        System.out.println(best.isPresent() ? best  + " : " + best.get().average() : "N/A");

        boolean b = students.stream()
                .noneMatch(s -> s.grades().isEmpty());


        System.out.println("-----------------------------------------------");


        List<String> csStudent = students.stream()
                .filter(s -> s.department().equals("CS"))
                .filter(s -> s.average() >= 80)
                .map(Student::name)
                .sorted()
                .collect(Collectors.toList());



        System.out.println(csStudent);
    }
}
