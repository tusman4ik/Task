package Logic.BoxLoading;

import Modules.Boxes.Box;
import Modules.Boxes.BoxesSize;
import Modules.Storages.BoxesStorage;
import Modules.Storages.FinalObjectStorage;
import Output.Information;

import java.util.ArrayList;

public class LoadManader {
    public static ArrayList<Box> secondStep() {
        ArrayList<Box> boxes = new ArrayList<>();
        int count = 0;
        while (FinalObjectStorage.getListOfPlaced().size() != 0) {
            BoxesStorage.addBox(Loader.load(BoxesSize.getParam(0)[0],
                    BoxesSize.getParam(0)[1], BoxesSize.getParam(0)[2]));
            count++;

        } Information.setCountBox(count);
        System.out.println("Count : " + count);
        return null;
    }
}
