package Modules.Storages;

import Modules.Boxes.Box;
import Modules.Objects.Obj;

import java.util.ArrayList;

public class FinalObjectStorage {
    private static ArrayList<Obj> listOfPlaced=new ArrayList<>();
    private static ArrayList<Obj> listOfNotPlaced=new ArrayList<>();
    public static void removeOfPlaced(Obj obj){
        listOfPlaced.remove(obj);
    }

    public static void setListOfPlaced(Obj obj) {
         listOfPlaced.add(obj);
    }

    public static void setListOfNotPlaced(Obj obj) {
        listOfNotPlaced.add(obj);
    }

    public static ArrayList<Obj> getListOfPlaced() {
        return listOfPlaced;
    }

    public static ArrayList<Obj> getListOfNotPlaced() {
        return listOfNotPlaced;
    }
}
