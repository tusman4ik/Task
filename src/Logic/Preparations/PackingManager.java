package Logic.Preparations;

import Modules.Objects.Obj;
import Modules.Storages.ObjectStorage;

import java.util.ArrayList;

public class PackingManager {

    public static ArrayList<Obj> packEverythingUnstackable(){
        ArrayList<Obj> objects= ObjectStorage.getObjects();
        for (Obj obj : objects){
            if (!obj.isStackable()){
                obj.putInTheBox();
            }
        }
        return objects;
    }
}
