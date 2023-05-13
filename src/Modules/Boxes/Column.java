package Modules.Boxes;

import java.util.ArrayList;

public class Column {

    private ArrayList<Box> floor = new ArrayList<>();
    int LastBoxType;

    public boolean addBox(Box box) {
        if (LastBoxType >= box.getBoxType() && (this.floor.size() == 0 && box.getBoxType() != 7) && floor.size() < 8) {
            floor.add(box);
            return true;
        }
        return false;
    }

    public int getArea() {
        return  BoxesSize.getBoxesSizeTable(floor.get(0).getBoxType())[0] *
                BoxesSize.getBoxesSizeTable(floor.get(0).getBoxType())[1];
    }
}
