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
/*
* Input
* *Написать метод, который парсит стринг в json
* Output
* *написать метод, который формирует структуру json по списку столбцов->ящиков->oбъектов
* Тестировать систему и написать результат по каждому методу
* */


}
