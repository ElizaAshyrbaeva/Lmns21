import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileReader();

        try (FileWriter fileWriter = new FileWriter("Number.txt")) {
            for (char c = 'A', i = 'a'; c <= 'Z'; c++, i++) {
                fileWriter.write(c + " " + i + "\n");

            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + " \n");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void fileReader() {
        try (FileReader fileReader = new FileReader("Number.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()) {
                counter++;
                System.out.println(counter+": "+scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}