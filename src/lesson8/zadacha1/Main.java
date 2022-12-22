/*Задача #1
    1. Создать динамический массив, содержащий объекты класса Contact. Класс Contact содержит имя контакта и его номер.
    2. Распечатать содержимое массива используя for each.
    3. Изменить номер первого контакта на новый.
    4. Удалить последний контакт из списка контактов.
    5. Получить массив содержащий контакты из коллекции тремя способами и вывести на консоль.
    6. Удалить все контакты из списка контактов.*/

package lesson8.zadacha1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayContact = new ArrayList<>();
//        arrayContact.add("name1");
//        arrayContact.add("name2");
//        arrayContact.add("name3");
//        arrayContact.add("name4");
//        arrayContact.add("name5");

        LinkedList<Contact> arrayContact = new LinkedList<>();

//        Contact contact = new Contact("Petr", "9876533");
        Contact contact = new Contact();
        contact.name = "Petr";
        contact.number = "98129736";

        arrayContact.addLast(contact);

        contact.name = "Alexander";
        contact.number = "91111736";

        arrayContact.addLast(contact);

//        arrayContact.addLast(contact1.name);

//          foreach
        for(Contact s : arrayContact) {
            System.out.println(s);
        }
//        System.out.println(arrayContact.toString());
//        arrayContact.forEach(System.out::println);
    }
}
