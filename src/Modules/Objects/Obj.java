package Modules.Objects;

import Manager.Log.L;
import Modules.Boxes.Box;
import Modules.Boxes.BoxSample;
import Modules.Boxes.Coordinates;
import Modules.Storages.FinalObjectStorage;

import java.util.Arrays;

public class Obj {
    private Coordinates sizes;
    private boolean stackable;
    private int weight;
    private String name;
    private int number;
    private boolean isBox;

    public Obj(Coordinates coordinates, boolean stackable, int weight, String name, int number) {
        this.sizes = new Coordinates(coordinates);
        this.stackable = stackable;
        this.weight = weight;
        this.name = name;
        this.number = number;
        this.isBox=false;

    }

    public boolean isBox() {
        return isBox;
    }

    public void putInTheBox() {
        int boxType = canFit();
        if (boxType < 0) {
            L.e("The object more everything box. Coordinates equals : \n x= " + this.sizes.getX()
                    + " y= " + this.sizes.getY() + " z= " + this.sizes.getZ() + " name = " + this.name);
            FinalObjectStorage.setListOfNotPlaced(this);
            return;
        }
        this.sizes = BoxSample.getBox(boxType).getOutside();
        this.weight += BoxSample.getBox(boxType).getWeight();
        this.isBox=true;

        FinalObjectStorage.setListOfPlaced(this);
    }

    public boolean isStackable() {
        return stackable;
    }

    public int canFit() {

        int[] objectSizes;
        boolean flag;
        Box box;
        int[] inside;
        for (int i = 7; i >= 0; i--) {
            objectSizes = sizes.getCoordsArray();
            Arrays.sort(objectSizes);
            inside = BoxSample.getBox(i).getInside().getCoordsArray();
            Arrays.sort(inside);
            flag = true;
            for (int j = 0; j < 3; j++) {
                if (!(objectSizes[j] <= inside[j])) {
                    //L.m("Box type " + i + " ;  " + j + ") object sizes " + objectSizes[j] + " box size " + inside[j]);
                    flag = false;
                }
            }

            if (flag) {
                return i;
            }
        }
        return -1;
    }

    public Coordinates getSizes() {
        return sizes;
    }

    public int getWeight() {
        return weight;
    }

}
