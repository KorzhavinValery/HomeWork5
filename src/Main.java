public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        /*
        У банка появилось мобильное приложение. Поэтому теперь,
        когда пользователь заходит на сайт с телефона, ему предлагается скачать приложение с учетом того,
        какая операционная система у пользователя.

Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:

Для iOS — «Установите версию приложения для iOS по ссылке».
Для Android — «Установите версию приложения для Android по ссылке».
Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
         */
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
    }
}