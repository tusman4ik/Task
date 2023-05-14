package Input;
import java.io.File;
import java.util.Scanner;

import Modules.Boxes.Coordinates;
import Modules.Objects.Obj;
import Modules.Storages.ObjectStorage;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

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

    public static void addObjFromJson(String jsonString) {
        try {
            // Parse JSON string into a JsonNode
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode objNode = objectMapper.readTree(jsonString);

            // Loop through each object in the JsonNode and create a new Obj for each one
            for (JsonNode node : objNode) {
                int number = node.get("number").asInt();
                String name = node.get("name").asText();
                int weight = node.get("weight").asInt();
                int length = node.get("length").asInt();
                int height = node.get("height").asInt();
                int width = node.get("width").asInt();
                boolean stackable = node.get("stackable").asBoolean();
                ObjectStorage.addObj(new Obj(new Coordinates(length, width, height),stackable,weight,name,number));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
/*
* Input
* *Написать метод, который парсит стринг в json
* Output
* *написать метод, который формирует структуру json по списку столбцов->ящиков->oбъектов
* Тестировать систему и написать результат по каждому методу
* */


}}
