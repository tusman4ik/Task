package Manager;

import Modules.Objects.Obj;

import java.util.ArrayList;
import java.util.List;

public class SelectionManager {
    public static List<Obj> selectByX(List<Obj> objList, int maxX) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            int x = obj.getSizes().getX();
            if (x <= maxX) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByY(List<Obj> objList, int maxY) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            int y = obj.getSizes().getY();
            if (y <= maxY) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByZ(List<Obj> objList, int maxZ) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            int z = obj.getSizes().getZ();
            if (z <= maxZ) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByWeight(List<Obj> objList, int maxWeight) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            int weight = obj.getWeight();
            if (weight <= maxWeight) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }
}
