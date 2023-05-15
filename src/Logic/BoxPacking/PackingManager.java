package Logic.BoxPacking;

import Modules.Boxes.Box;
import Modules.Storages.BoxesStorage;
import Modules.Storages.Column;
import Modules.Storages.Storage;

import java.util.ArrayList;

public class PackingManager {
    public static void thirdStep(){
        ArrayList<Box> boxes= BoxesStorage.getBoxess();
        Column column=new Column();
        for (Box box : boxes){
            if (!column.addBox(box)){
                Storage.addColumn(column);
                column=new Column();
                column.addBox(box);
            }

        }
        System.out.println("Final Area : "+Storage.getArea());
    }


}
