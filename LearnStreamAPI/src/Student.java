

public class Student {
    private final int id;
    private final String name;
    private final String department;
    private final int age;
    private final double grade;


    public Student(int id, String name, String department, int age, double grade) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + grade;
    }
}