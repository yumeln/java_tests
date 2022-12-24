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

        LinkedList<Contact> arrayContact = new LinkedList<>();

        Contact contact1 = new Contact("Petr", "9876533");
        Contact contact2 = new Contact("Nik", "9822233");
        Contact contact3 = new Contact("Katya", "22276533");

        arrayContact.addLast(contact1);
        arrayContact.addLast(contact2);
        arrayContact.addLast(contact3);

//        2. Распечатать содержимое массива используя for each.
//          foreach
        for(Contact s : arrayContact) {
            System.out.println(s);
        }

//        3. Изменить номер первого контакта на новый.

        arrayContact.get(0).number = "1111111";
        System.out.println(arrayContact.toString());

//        4. Удалить последний контакт из списка контактов.
        arrayContact.removeLast();
        arrayContact.forEach(System.out::println);


    }
}
