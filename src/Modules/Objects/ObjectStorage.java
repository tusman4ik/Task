package Modules.Objects;

import java.util.ArrayList;

public class ObjectStorage {
     private static ArrayList<Obj> objects =new ArrayList<>();
     private static int count=0;

     public static void addObj(Obj obj){
         objects.add(obj);
         count++;
     }

    public static ArrayList<Obj> getObjects() {
        return objects;
    }

    public static int getCount() {
        return count;
    }
}
