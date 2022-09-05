public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
        task_9();
    }

    public static void task_1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) { //Выводим в консоль все числа от 10 до - 10 ВКЛЮЧИТЕЛЬНО
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_5() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4) { //2100 год  не будет високосным =)
            System.out.printf("%d год является високосным.%n", i);
        }
        System.out.println("***\n");
    }

    public static void task_6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 100; i += 7) {
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 1000; i *= 2) {
            System.out.println(i);
        }
        System.out.println("***\n");
    }

    public static void task_8() {
        System.out.println("Задание 8");
        int monthlyStash = 29000; // Месячная заначка
        int moneyStock = 0;    // Запас денег
        for (int i = 1; i <= 12; i++) {
            moneyStock += monthlyStash;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей.%n", i, moneyStock);
        }
        System.out.println("***\n");
    }

    public static void task_9() {
        System.out.println("Задание 9");
        int moneyStock = 29000;  //месячное пополнение счета
        int bankAccount = 0;  //счет в банке
        for (int i = 1; i <= 12; i++) {
            bankAccount = bankAccount + moneyStock + bankAccount / 100; //в первом месяце процентов нет. Это более приближено к реальной жизни. Если хотим проценты и в первый месяц, тогда в одной строке начисляем деньги на счет, а проценты на счет начисляем в следующей строке.
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей.%n", i, bankAccount);
        }
        System.out.println("***\n");
    }
}