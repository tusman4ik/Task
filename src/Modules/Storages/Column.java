package Modules.Storages;

import Modules.Boxes.Box;
import Modules.Boxes.BoxesSize;

import java.util.ArrayList;

public class Column {

    private ArrayList<Box> floor = new ArrayList<>();
    int lastBoxType;

    public boolean addBox(Box box) {
        if (lastBoxType >= box.getBoxType() && (this.floor.size() == 0 && box.getBoxType() != 7) && floor.size() < 8) {
            floor.add(box);
            lastBoxType=box.getBoxType();
            return true;
        }
        return false;
    }

    public int getArea( ) {
        return floor.get(0).getArea();
    }
}
