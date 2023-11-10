package task6;

public final class FileTest {

    public static void testFile() {

        //Слова в файле: Дыня Арбуз Колобок Зонд Коса
        File file = new File("test.txt");

        //Исходный файл
        System.out.println("Исходный файл:");
        file.printFile();
        System.out.println();

        //Итоговый файл
        file.getLine();
        System.out.println("Итоговый файл:");
        file.printFile();

    }
}
