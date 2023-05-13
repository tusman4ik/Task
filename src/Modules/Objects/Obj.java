package Modules.Objects;

import Modules.Boxes.Box;
import Modules.Boxes.BoxSample;
import Modules.Boxes.BoxesSize;
import Modules.Boxes.Coordinates;

import java.util.Arrays;

public class Obj {
    private Coordinates sizes;


    private boolean stackable;
    private int weight;


    public Obj(Coordinates coordinates, boolean stackable, int weight) {
        this.sizes=new Coordinates(coordinates);
        this.stackable = stackable;
        this.weight = weight;
    }

    public void putInTheBox() {
        int boxType = canFit();
        if (boxType < 0) {
            throw new ArithmeticException("The object more everything box");
        }
        int[] outside=BoxSample.getBox(boxType).getOutside().getArrayCoord();

    }

    public boolean isStackable() {
        return stackable;
    }

    public int canFit() {
        int[] objectSizes = sizes.getArrayCoord();
        Arrays.sort(objectSizes);
        boolean flag;
        Box box;
        int [] inside;
        for (int i = 7; i >= 0; i--) {
            box= BoxSample.getBox(i);
            inside=box.getInside().getArrayCoord();
            Arrays.sort(inside);

            flag = true;
            for (int j = 0; j < 3; j++) {
                if (!(objectSizes[j] <= inside[j])) {
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
