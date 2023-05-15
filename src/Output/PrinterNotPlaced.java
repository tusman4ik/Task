package Output;

import Modules.Objects.Obj;
import Modules.Storages.FinalObjectStorage;

import java.util.ArrayList;

public class PrinterNotPlaced {
    public static void print(){
        System.out.println(" ");
        System.out.println( " ");
        System.out.println("Objects that couldn't fit");
        System.out.println(" ");
        ArrayList<Obj> objs= FinalObjectStorage.getListOfNotPlaced();
        for (Obj obj : objs ){
            System.out.println("name : "+obj.getName());
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
