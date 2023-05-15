package Modules.Boxes;

import Modules.Objects.Obj;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;


public class Box {
    @JsonIgnore
    int area;
    @JsonProperty("boxType")
    private int boxType;
    @JsonProperty("objects")
    private ArrayList<Obj> objects = new ArrayList<>();

    @JsonIgnore
    private Coordinates inside;

    @JsonIgnore
    private Coordinates outside;
    @JsonIgnore
    private int weight;


    public void addContent(Obj obj) {
        this.objects.add(obj);
    }

    public Box(int boxType) {
        this.boxType = boxType;
        int[] buffer = BoxesSize.getParam(boxType);
        this.inside = new Coordinates(buffer[0] - 4, buffer[1] - 4, buffer[2] - 4);
        this.outside = new Coordinates(buffer[0], buffer[1], buffer[2]);
        this.weight = buffer[3];
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

    public int getArea() {
        return this.outside.getX() * this.outside.getY();
    }

    public int getWeight() {
        return weight;
    }

    public int getBoxType() {
        return boxType;
    }
}
