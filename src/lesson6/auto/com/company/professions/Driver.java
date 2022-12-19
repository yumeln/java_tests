package lesson6.auto.com.company.professions;

public class Driver extends Person {
    String fullName;
    int experience;

    public Driver() {
    }

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver { " +
                "fullName ='" + fullName + '\'' +
                ", experience =" + experience +
                '}';
    }
}
