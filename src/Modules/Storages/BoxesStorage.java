package Modules.Storages;

import Modules.Boxes.Box;

import java.util.ArrayList;

public class BoxesStorage {
    private static ArrayList<Box> boxess = new ArrayList<>();

    public static void addBox(Box box){
        boxess.add(box);
    }

    public static ArrayList<Box> getBoxess() {
        return boxess;
    }
}
