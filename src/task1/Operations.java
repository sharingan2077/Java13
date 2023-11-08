package task1;

import java.util.Scanner;


public final class Operations {

    private static final Scanner scan = new Scanner(System.in);

    private static String s;

    public static void startTask() {
        System.out.println("Введите строку:");
        s = scan.nextLine();
        operate(s);
        operateNext();
    }

    static void operateNext() {
        Constants.printNext();
        String choice = scan.nextLine();
        switch (choice) {
            case "1": {
                System.out.println("Так точно! Текущая строка - " + s);
                operate(s);
                operateNext();
                break;
            }
            case "2": {
                startTask();
                break;
            }
            case "3": {
                System.out.println("Приложение завершено!");
                break;
            }
            default: {
                System.out.println("Неправильно выбрано действие, повторите попытку:");
                operateNext();
            }
        }
    }

    static void operate(String s) {
        System.out.println("Выберите действие:");
        Constants.printInfo();
        String choice = scan.nextLine();
        switch (choice) {
            case "1": {
                Tasks.task1(s);
                break;
            }
            case "2": {
                Tasks.task2(s);
                break;
            }
            case "3": {
                Tasks.task3(s);
                break;
            }
            case "4": {
                Tasks.task4(s);
                break;
            }
            case "5": {
                Tasks.task5(s);
                break;
            }
            case "6": {
                Tasks.task6(s);
                break;
            }
            case "7": {
                Tasks.task7(s);
                break;
            }
            case "8": {
                Tasks.task8(s);
                break;
            }
            case "9": {
                Tasks.task9(s);
                break;
            }
            default: {
                System.out.println("Ошибка");
                operate(s);
            }
        }
    }


}
