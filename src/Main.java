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
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int iOs = 0;
        int android = 1;
        int clientDeviceYear = 2015;
        int checkYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}