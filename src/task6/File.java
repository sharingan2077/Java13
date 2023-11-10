package task6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

final class File {

    private final String path;
    private StringBuilder builder;
    private String[] wordsCorrect;

    File(String path) {
        this.path = path;
    }

    void getLine() {
        readFile();
        getWordsCorrect();
        writeFile();
    }

    private void readFile() {
        try {
            FileReader fileReader = new FileReader(path);
            builder = new StringBuilder();
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                builder.append((char) symbol);
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getWordsCorrect() {
        wordsCorrect = builder.toString().split(" ");
        String cache = wordsCorrect[0];
        String cache_2 = wordsCorrect[1];
        wordsCorrect[0] = wordsCorrect[2];
        wordsCorrect[1] = wordsCorrect[4];
        wordsCorrect[2] = cache_2;
        wordsCorrect[4] = cache;
    }

    private void writeFile() {
        try {
            FileWriter writer = new FileWriter(path);
            for (String word : wordsCorrect) {
                writer.write(word);
                writer.append(' ');
            }
            writer.close();
        } catch (IOException exception) {
            System.out.println("Неверный путь к файлу");
        }

    }

    void printFile() {
        try {
            FileReader reader = new FileReader(path);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
