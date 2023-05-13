package Modules.Boxes;

import java.util.ArrayList;

public class BoxSample {
    private static ArrayList<Box> boxes;
    public static Box getBox(int boxType){
        for (int i=0;i<8;i++){
            boxes.add(new Box(i));
        }
        return boxes.get(boxType);
    }
}
