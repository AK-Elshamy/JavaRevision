import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(1, "Ahmed", "IS", 21, 85.5),
                new Student(2, "Ali", "CS", 22, 91.0),
                new Student(3, "Mina", "IS", 20, 76.5),
                new Student(4, "Omar", "CS", 23, 68.0),
                new Student(5, "Youssef", "AI", 21, 95.0),
                new Student(6, "Menna", "IS", 22, 88.0),
                new Student(7, "Doha", "AI", 20, 72.5),
                new Student(8, "Fatma", "CS", 21, 84.0)
        );

        System.out.println("--------------------#1-------------------------");

        students.stream()
                .forEach(s -> System.out.println(s.getName()));


        System.out.println("---------------------#2------------------------");

        students.stream()
                .filter(student -> student.getGrade() >= 80)
                .forEach(s -> System.out.println(s.getName()));

        System.out.println("---------------------#3------------------------");

        students.stream()
                .filter(s -> s.getDepartment().equals("IS"))
                .forEach(s -> System.out.println(s.getName()));

        System.out.println("---------------------#4------------------------");

        students.stream().
        map(Student::getAge)
                .distinct()
                .forEach(System.out::println);
        System.out.println("---------------------#5------------------------");

        List<String> studentName = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(studentName);

        System.out.println("---------------------#6------------------------");



        var studentNameUpperCase = studentName.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(studentNameUpperCase);
        System.out.println("---------------------#7------------------------");


        students.stream()
                .forEach(s -> System.out.println(s.getGrade() + 5));

        System.out.println("---------------------#8------------------------");


        students.stream()
                .map(Student::getGrade)
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------#9------------------------");

        students.stream()
                .map(Student::getGrade)
                .sorted((a, b) -> Double.compare(b,a))
                .forEach(System.out::println);
        System.out.println("---------------------#10------------------------");
        students.stream()
                .sorted(Comparator.comparing(Student::getDepartment).thenComparing(Student::getGrade).reversed())
                .forEach(System.out::println);

        System.out.println("---------------------#11------------------------");

        students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------#12------------------------");


        students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .skip(3)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------#13------------------------");

        boolean b = students.stream()
                .anyMatch(s -> s.getGrade() > 90);
        System.out.println(b);
        System.out.println("---------------------#14------------------------");
        students.stream()
                .filter(s -> s.getAge() >= 18)
                .forEach(System.out::println);
        System.out.println("---------------------#15------------------------");


        boolean b1 = students.stream()
                .noneMatch(s -> s.getGrade() < 50);
        System.out.println(b1)
        ;

        System.out.println("---------------------#16------------------------");
        Optional<Student> first = students.stream().
                filter(s -> s.getDepartment().equals("AI"))
                .findFirst();
        System.out.println(first.isPresent() ? first : "N/A");
        System.out.println("---------------------#17------------------------");

        long count = students.stream().count();
        System.out.println(count);
        System.out.println("---------------------#18------------------------");
        Optional<Student> min = students.stream()
                .min(Comparator.comparing(Student::getGrade));
        System.out.println(min.isPresent() ? min : "N/A");
        System.out.println("---------------------#19------------------------");
        Optional<Student> max = students.stream()
                .max(Comparator.comparing(Student::getGrade));
        System.out.println(max.isPresent() ? max : "N/A");

        System.out.println("---------------------#20------------------------");

        double v = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
        System.out.println("average: " + v);
        System.out.println("---------------------#21------------------------");

        OptionalDouble reduce = students.stream()
                .mapToDouble(Student::getGrade)
                .reduce(Double::sum);
        System.out.println("sum: " + reduce);
        System.out.println("---------------------#22------------------------");

        var studentWithGradeMax80 =
                students.stream()
                        .filter(s -> s.getGrade() >= 80)
                        .map(Student::getName)
                        .collect(Collectors.toList());
        System.out.println(studentWithGradeMax80);
        System.out.println("---------------------#23------------------------");
        Set<String> collect = students.stream()
                .map(Student::getDepartment)
                .collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println("---------------------#24------------------------");

        Map<Integer, String> mp = students.stream()
                        .collect(Collectors.toMap(Student::getId, Student::getName));


        mp.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " --> " + e.getValue());
        });

        System.out.println("-------------------#25------------------------------");
        List<List<String>> groups = List.of(
                List.of("Ahmed", "Ali"),
                List.of("Mina", "Omar"),
                List.of("Youssef", "Menna")
        );

        List<String> lsString = groups.stream()
                .flatMap(s -> s.stream()).
                collect(Collectors.toList());
        System.out.println(lsString);
        System.out.println("--------------------Final Challenge-------------------------");
        printTopStudentsByDepartment(students, "IS");

    }
    public static void printTopStudentsByDepartment(
            List<Student> students,
            String department
    ){
        students.stream()
                .filter(s -> s.getDepartment().equals(department))
                .filter(s -> s.getGrade() >= 80)
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}