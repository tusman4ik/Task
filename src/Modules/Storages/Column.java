package Modules.Storages;

import Modules.Boxes.Box;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({"id", "box"})
public class Column {
    @JsonProperty("id")
    private int id;

    public int getId() {
        return Storage.getStorage().indexOf(this);
    }

    @JsonProperty ("boxes")
    private ArrayList<Box> boxes = new ArrayList<>();

    @JsonProperty ("boxes")
    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    int lastBoxType = Integer.MIN_VALUE;

    public boolean addBox(Box box) {
        if ((lastBoxType >= box.getBoxType() || (this.boxes.size() == 0 && box.getBoxType() != 8)) && boxes.size() < 4) {
            boxes.add(box);
            lastBoxType = box.getBoxType();
            return true;
        }
        return false;
    }

    @JsonIgnore
    public int getAreaOfColumn() {
        return boxes.get(0).getArea();
    }
}
