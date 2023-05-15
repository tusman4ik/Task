package Logic.BoxLoading;

import Manager.SelectionManager;
import Modules.Boxes.Box;
import Modules.Objects.Obj;
import Modules.Storages.FinalObjectStorage;

import java.util.ArrayList;
import java.util.List;


public class Loader {
    private static Box box;
    static int  weight;

    public static Box load(int x, int y, int z ){
        box=new Box(0);
        weight=10_000;
        loadRecursively(x,y,z );
        return box;
    }
    public static void loadRecursively(int x, int y, int z ) {
        Obj obj=findTheRightOne(x,y,z );
        if (obj==null){
            return;
        }
        box.addContent(obj);
        weight-=obj.getWeight();
        FinalObjectStorage.removeOfPlaced(obj);
        loadRecursively(x-obj.getSizes().getX(),y,z);
        loadRecursively(obj.getSizes().getX(),y-obj.getSizes().getY(),z);
        loadRecursively(obj.getSizes().getX(),obj.getSizes().getY(),z-obj.getSizes().getZ());

    }


    public static Obj findTheRightOne(int x, int y, int z ) {
        ArrayList<Obj> list = ObjectFilter.objectFilter(FinalObjectStorage.getListOfPlaced(), x, y, z);
        list = (ArrayList<Obj>) SelectionManager.selectByWeight(list, weight);
        return findMaxVolume(list);
    }

    public static Obj findMaxVolume(ArrayList<Obj> objs) {
        Obj maxVol = null;
        int maxVolume = 0;
        for (Obj obj : objs) {
            if ((obj.getSizes().getX() * obj.getSizes().getY() * obj.getSizes().getZ()) > maxVolume) {
                maxVolume = obj.getSizes().getX() * obj.getSizes().getY() * obj.getSizes().getZ();
                maxVol = obj;
            }
        }
        return maxVol;
    }

}
