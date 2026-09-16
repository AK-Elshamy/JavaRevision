import java.util.List;

record Student(

        String name,
        int age,
        String department,
        List<Double> grades
){
    double average(){
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }
}