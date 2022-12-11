package lesson5.hard;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    double sum;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    double getScholarship() {
        System.out.println("Студент получает стипендию " + sum);
        return sum;
    }
}
