package Manager;

import Modules.Objects.Obj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortManager {
    public static List<Obj> sortByX(List<Obj> objList) {
        List<Obj> sortedList = new ArrayList<>(objList);
        Collections.sort(sortedList, new Comparator<Obj>() {
            public int compare(Obj obj1, Obj obj2) {
                return obj1.getX() - obj2.getX();
            }
        });

        return sortedList;
    }

    public static List<Obj> sortByY(List<Obj> objList) {
        List<Obj> sortedList = new ArrayList<>(objList);
        Collections.sort(sortedList, new Comparator<Obj>() {
            public int compare(Obj obj1, Obj obj2) {
                return obj1.getY() - obj2.getY();
            }
        });
        return sortedList;
    }

    public static List<Obj> sortByZ(List<Obj> objList) {
        List<Obj> sortedList = new ArrayList<>(objList);
        Collections.sort(sortedList, new Comparator<Obj>() {
            public int compare(Obj obj1, Obj obj2) {
                return obj1.getZ() - obj2.getZ();
            }
        });
        return sortedList;
    }
    public static List<Obj> sortByWeight(List<Obj> objList) {
        List<Obj> sortedList = new ArrayList<>(objList);
        Collections.sort(sortedList, new Comparator<Obj>() {
            public int compare(Obj obj1, Obj obj2) {
                return Double.compare(obj1.getWeight(), obj2.getWeight());
            }
        });
        return sortedList;
    }
}
