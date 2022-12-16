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
        if (averageMark == 5) {
            sum = 1750;
            System.out.println("Студент получает стипендию " + sum);

        } else if (averageMark >= 4 && averageMark < 5 ) {
            sum = 1710;
            System.out.println("Студент получает стипендию " + sum);

        } else {
            System.out.println("Студент не получает стипендию ");
        }
        return sum;
    }

    void print() {
        System.out.println("Студент");
    }

}
