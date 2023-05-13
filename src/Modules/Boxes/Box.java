package Modules.Boxes;

import Modules.Objects.Obj;

import java.util.ArrayList;

public class Box {

    private ArrayList<Obj> objects = new ArrayList<>();
    private int boxType;
    private Coordinates inside;
    private Coordinates outside;
    private int weight;


    public void addContent(Obj obj){
        this.objects.add(obj);
    }

    public Box(int boxType) {
        this.boxType = boxType;
        int [] buffer=BoxesSize.getParam(boxType);
        this.inside=new Coordinates(buffer[0]-4,buffer[1]-4,buffer[2]-4);
        this.outside=new Coordinates(buffer[0],buffer[1],buffer[2]);
        this.weight=buffer[3];
    }

    public ArrayList<Obj> getObjects() {
        return objects;
    }

    public Coordinates getInside() {
        return inside;
    }

    public Coordinates getOutside() {
        return outside;
    }
    public int getArea(){
        return this.outside.getX()*this.outside.getY();
    }
    public int getWeight() {
        return weight;
    }

    public int getBoxType() {
        return boxType;
    }
}
