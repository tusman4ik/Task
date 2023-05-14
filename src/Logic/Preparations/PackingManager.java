package Logic.Preparations;

import Input.InputManager;
import Manager.Log.L;
import Modules.Objects.Obj;
import Modules.Storages.FinalObjectStorage;
import Modules.Storages.ObjectStorage;

import java.util.ArrayList;

public class PackingManager {

    public static void packEverything(){
        ArrayList<Obj> objects= ObjectStorage.getObjects();
        for (Obj obj : objects){
            if (!obj.isStackable()){
                obj.putInTheBox();
            }else if(obj.canFit()!=-1){
                FinalObjectStorage.setListOfPlaced(obj);
            }else {
                FinalObjectStorage.setListOfNotPlaced(obj);

            }
        }

    }
    public static void firtStep(String filePath){
        String data= InputManager.readFileToString(filePath);
        InputManager.addObjFromJson(data);
        packEverything();
        System.out.println("Placed : "+ FinalObjectStorage.getListOfPlaced().size());
        System.out.println("NotPlaced : "+ FinalObjectStorage.getListOfNotPlaced().size());

    }
}
