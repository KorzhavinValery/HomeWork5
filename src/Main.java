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
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        /*
        Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.

Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.

Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
         */
        int deliveryDistance = 95;
        boolean secondDistance = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean thirdDistance = deliveryDistance > 60 && deliveryDistance <= 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");

        } else if (secondDistance) {
            System.out.println("Потребуется 2 дня");
        } else if (thirdDistance) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
    }
}