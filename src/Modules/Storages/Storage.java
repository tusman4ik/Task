package Modules.Storages;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

public class Storage {
    @JsonPropertyOrder({"storage"})
    private static ArrayList<Column> storage=new ArrayList<>();

    public static int getArea(){
        int sum = 0;
        for (Column column:storage){
            sum+=column.getAreaOfColumn();
        }
        return sum;
    }
    @JsonPropertyOrder({"storage"})
    public static ArrayList<Column> getStorage() {
        return storage;
    }

    public static void addColumn(Column column){
        storage.add(column);
    }
}
