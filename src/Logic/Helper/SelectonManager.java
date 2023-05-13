package Logic.Helper;

import Modules.Objects.Obj;

import java.util.ArrayList;
import java.util.List;

public class SelectonManager {
    public static List<Obj> selectByX(List<Obj> objList, double maxX) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            double x = obj.getX();
            if (x < maxX) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByY(List<Obj> objList, double maxY) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            double y = obj.getY();
            if (y < maxY) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByZ(List<Obj> objList, double maxZ) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            double z = obj.getZ();
            if (z < maxZ) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }

    public static List<Obj> selectByWeight(List<Obj> objList, double maxWeight) {
        List<Obj> selectedList = new ArrayList<>();
        for (Obj obj : objList) {
            double weight = obj.getWeight();
            if (weight < maxWeight) {
                selectedList.add(obj);
            }
        }
        return selectedList;
    }
}
