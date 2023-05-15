package Modules.Objects;

import Manager.Log.L;
import Modules.Boxes.Box;
import Modules.Boxes.BoxSample;
import Modules.Boxes.Coordinates;
import Modules.Storages.FinalObjectStorage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Arrays;

public class Obj {
    @JsonIgnore
    private Coordinates sizes;
    @JsonIgnore
    private boolean stackable;
    @JsonIgnore
    private int weight;
    @JsonIgnore
    int area;
    @JsonIgnore
    int box;
    private String name;
    @JsonIgnore
    private int number;
    @JsonIgnore
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

            FinalObjectStorage.setListOfNotPlaced(this);
            return;
        }
        this.sizes = BoxSample.getBox(boxType).getOutside();
        this.weight += BoxSample.getBox(boxType).getWeight();
        this.isBox=true;

        FinalObjectStorage.setListOfPlaced(this);
    }

    public String getName() {
        return name;
    }

    public boolean isStackable() {
        return stackable;
    }

    public int canFit() {

        int[] objectSizes;
        boolean flag;
        Box box;
        int[] inside;
        for (int i = 8; i >= 0; i--) {
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
