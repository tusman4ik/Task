package Modules.Objects;

import Modules.Boxes.BoxesSize;

import java.util.Arrays;

public class Obj {
    private int x;
    private int y;
    private int z;


    private boolean stackable;
    private int weight;


    public Obj(int x, int y, int z, boolean stackable, int weight) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.stackable = stackable;
        this.weight = weight;
    }

    public void putInTheBox() {
        int boxType = canFit();
        if (boxType < 0) {
            throw new ArithmeticException("The object more everything box");
        }
        this.x = BoxesSize.getBoxesSizesAndWeightTable(canFit())[0];
        this.y = BoxesSize.getBoxesSizesAndWeightTable(canFit())[1];
        this.z = BoxesSize.getBoxesSizesAndWeightTable(canFit())[2];
        this.weight += BoxesSize.getBoxesSizesAndWeightTable(canFit())[3];
    }

    public boolean isStackable() {
        return stackable;
    }

    public int canFit() {

        int[] objectSizes = {this.x, this.y, this.z};
        Arrays.sort(objectSizes);
        boolean flag;

        for (int i = 7; i >= 0; i--) {
            int[] boxesSizes = BoxesSize.getInsideBoxesSizeTable(i);
            Arrays.sort(boxesSizes);
            flag = true;
            for (int j = 0; j < 3; j++) {
                if (!(objectSizes[j] <= boxesSizes[j])) {
                    flag = false;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getWeight() {
        return weight;
    }

}
