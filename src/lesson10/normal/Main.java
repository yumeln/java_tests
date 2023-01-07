//        1. Создать класс RegistrationSercice, содержащий метод registration и checkLoginAndPassword.
//        2. Метод registration принимает на вход три параметра: login, password и confirmPassword.
//        Метод registration вызывает метод checkLoginAndPassword, передав ему все параметры
//        (checkLoginAndPassword тоже принимает три параметра). Метод checkLoginAndPassword проверяет переданные параметры.
//        3. Длина login должна быть меньше 16 символов. Если login не соответствует этому требованию,
//        необходимо выбросить исключение WrongLoginException.
//        4. Длина password должна быть меньше 8 символов. Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//        5. WrongPasswordException и WrongLoginException - пользовательские классы, проверяемые
//        исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает
//        его в конструктор класса Exception.
//        6. Обработка исключений проводится внутри метода registration. Используем try-catch.
//        7. Метод  registration выводит на консоль "Регистрация прошла успешно" при отсутствии ошибок.
//        8. Если метод checkLoginAndPassword выбросил WrongLoginException, необходимо вывести на консоль
//        "Логин должен содержать менее 16 символов". Если выбросил WrongPasswordException -
//        "Пароль должен содержать менее 8 символов. Необходимо подтвердить пароль".

package lesson10.normal;

public class Main {
}
