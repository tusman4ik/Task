package Output;

import Modules.Storages.FinalObjectStorage;
import Modules.Storages.Storage;

public class Information {
    static int countBox;
    static int area;

    public static int getCountBox() {
        return countBox;
    }

    public static void setCountBox(int countBox) {
        Information.countBox = countBox;
    }

    public static int getArea() {
        return area;
    }

    public static void setArea(int area) {
        Information.area = area;
    }

    public static void print(){
        System.out.println("Information");
        System.out.println(" ");
        System.out.println("Fit : "+ area);
        System.out.println("Did not fit : "+ FinalObjectStorage.getListOfNotPlaced().size());
        System.out.println("Number of boxes : "+ countBox);
        System.out.println("Whole area : "+ Storage.getArea()+" mm²");


    }
}
