package Modules.Storages;

import java.util.ArrayList;

public class BoxesStorage {
    private ArrayList<Column> storage=new ArrayList<>();

    public int getArea(){
        int sum = 0;
        for (Column column:storage){
            sum+=column.getArea();
        }
        return sum;
    }
}
