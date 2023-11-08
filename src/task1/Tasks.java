package task1;

final class Tasks {

    //(1) - Распечатать последний символ строки
    static void task1(String s) {
        System.out.println("Последний символ строки " + s + " - " + s.charAt(s.length() - 1));
    }
    //(2) - Проверить, заканчивается ли строка символами "!!!"
    static void task2(String s) {
        if (s.endsWith("!!!")) {
            System.out.println("Строка " + s + " заканчивается символами \"!!!\"");
        } else {
            System.out.println("Строка " + s + " не заканчивается символами \"!!!\"");
        }
    }
    //(3) - Проверить, начинается ли строка с "I like"
    static void task3(String s) {
        if (s.startsWith("I like")) {
            System.out.println("Строка " + s + " начинается с символов \"I like\"");
        } else {
            System.out.println("Строка " + s + " не начинается с символов \"I like\"");
        }
    }
    //(4) - Проверить, содержит ли строка подстроку "Java"
    static void task4(String s) {
        if (s.contains("Java")) {
            System.out.println("Строка " + s + " содержит подстроку \"Java\"");
        } else {
            System.out.println("Строка " + s + " не содержит подстроку \"Java\"");
        }

    }
    //(5) - Найти позицию подстроки "Java" в строке "I like Java!!!"
    static void task5(String s) {
        System.out.println("Позиция подстроки \"Java\" в строке \"I like Java\" - " + "I like Java!!!".indexOf("Java"));
    }
    //(6) - Заменить все символы "a" на "o"
    static void task6(String s) {
        System.out.println("Замена всех символов \"a\" на \"o\" в строке " + s + " - " + s.replace('a', 'o'));

    }
    //(7) - Преобразовать строку к верхнему регистру
    static void task7(String s) {
        System.out.println("Преобразовали строку " + s + " к верхнему регистру - " + s.toUpperCase());
    }

    //(8) - Преобразовать строку к нижнему регистру
    static void task8(String s) {
        System.out.println("Преобразовали " + s + " к нижнему регистру - " + s.toLowerCase());
    }

    //(9) - Вырезать строку "Java"
    static void task9(String s) {
        int index = s.indexOf("Java");
        System.out.print("Вырезали подстроку \"Java\" из строки " + s + " - ");
        switch (index) {
            case -1: {
                System.out.println(s);
                break;
            }
            default: {
                System.out.println(s.substring(0, s.indexOf("Java")) + s.substring(s.indexOf("Java") + 4));
            }
        }
    }
}
