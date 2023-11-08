package task1;

enum Constants {

    First("(1) - Распечатать последний символ строки"),
    Second("(2) - Проверить, заканчивается ли строка символами \"!!!\""),
    Third("(3) - Проверить, начинается ли строка с \"I like\""),
    Fourth("(4) - Проверить, содержит ли строка подстроку \"Java\""),
    Fifth("(5) - Найти позицию подстроки \"Java\" в строке \"I like Java!!!\""),
    Sixth("(6) - Заменить все символы \"a\" на \"o\""),
    Seventh("(7) - Преобразовать строку к верхнему регистру"),
    Eighth("(8) - Преобразовать строку к нижнему регистру"),
    Ninth("(9) - Вырезать строку \"Java\""),
    INFO("(1) - Продолжить работу с текущей строкой\n(2) - Изменить текущую строку\n(3) - Завершить программу");
    private static final Constants[] allConstants = {First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth};
    private final String title;
    Constants(String title) {
        this.title = title;

    }

    @Override
    public String toString() {
        return title;
    }

    static void printInfo() {
        for (Constants i : allConstants)
            System.out.println(i);
    }
    static void printNext() {
        System.out.println(INFO);
    }
}
