package lesson5.normal;

public class Reader {

    String name;
    int number;
    String faculty;
    String date;
    String phone;

    //constructor
    public Reader(String name, int number, String faculty, String date, String phone) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.phone = phone;
    }
// геттер сеттер


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // takebook
    void takeBook(int numberBooks) {
        System.out.println(name + " взял " + numberBooks + " книги ");
    }

    void takeBook(String book) {
        System.out.println(name + " взял книгу " + book);
    }

    void takeBook(Book book) {
        System.out.println(name  + " взял книгу " + book.bookName + ", автор - " + book.author);
    }

    void returnBook() {
    }

}


