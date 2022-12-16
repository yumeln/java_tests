package lesson5.hard;

public class Aspirant extends Student {
    String scientificWork;


    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    double getScholarship() {
        if (averageMark == 5) {
            sum = 1950;
            System.out.println("Аспирант получает стипендию " + sum);

        } else if (averageMark >= 4 && averageMark < 5 ) {
            sum = 1910;
            System.out.println("Аспирант получает стипендию " + sum);

        } else {
            System.out.println("Аспирант не получает стипендию ");
        }
        return sum;
    }

    @Override
    void print(){
        System.out.println("Аспирант");
    }
}
