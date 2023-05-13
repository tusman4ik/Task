package Input;

import java.io.File;
import java.util.Scanner;

public class InputManager {
    public static String readFileToString(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                if (scanner.hasNextLine()) {
                    stringBuilder.append(System.lineSeparator());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String fileName = "file.txt";
        String fileContent = readFileToString(fileName);
        System.out.println(fileContent);
    }

}
