/*Определить класс Reader, хранящий следующую информацию о пользователе библиотеки.
        1. ФИО.
        2. Номер читательского билета.
        3. Факультет.
        4. Дата рождения.
        5. Телефон.
        6. Методы takeBook(), returnBook().

        Разработать программу, в которой создается массив объектов данного класса.
        Перегрузить методы takeBook(), returnBook() (вспомнить, либо загуглить, что из себя представляет перегрузка в Java):
        - takeBook, который будет принимать количество взятых книг (выводит на консоль сообщение "Петров В. В. взял 3 книги");
        - takeBook, который будет принимать название книги (выводит на консоль сообщение "Петров В. В. взял книгу <название книги>");
        - takeBook, который будет принимать объект класса Book (создать новый класс, содержащий имя и автора книги) (выводит на консоль сообщение "Петров В. В. взял книгу <название книги>, автор - <имя автора книги>".
        Аналогичным образом перегрузить метод returnBook() ("ВЗЯЛ" заменить на "ВЕРНУЛ": "Петров В. В. вернул ...").*/



package lesson5.normal;

public class Main {

    public static void main(String[] args) {
        Reader person1 = new Reader("Петров В. В.", 21393, "Литературы", "21-03-2022", "+7098897");
        Book book = new Book("Записки врача", "Булгаков");

        person1.takeBook(book);


    }
}
