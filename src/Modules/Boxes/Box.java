package Modules.Boxes;

import Modules.Objects.Obj;

import java.util.ArrayList;

public class Box {
    private int x;
    private int y;
    private int z;
    private int weight;
    private int maxWeight;
    private ArrayList<Obj> objects = new ArrayList<>();
    private int boxType;

    public ArrayList<Obj> getObjects() {
        return objects;
    }

    public int getBoxType() {
        return boxType;
    }
    public void addContent(Obj obj){
        this.objects.add(obj);
    }



    public Box(int boxType) {
        int[] buffer=BoxesSize.getBoxesSizeTable(boxType);
        this.x = buffer[0];
        this.y = buffer[1];
        this.z = buffer[2];
        this.weight = buffer[3];
        this.objects = new ArrayList<>();
        this.boxType = boxType;
        this.maxWeight=5_000;
    }
}
