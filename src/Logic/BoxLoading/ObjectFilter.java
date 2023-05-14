package Logic.BoxLoading;

import Modules.Objects.Obj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectFilter {
    public static ArrayList<Obj> objectFilter(ArrayList<Obj> objs, int x, int y, int z) {
        ArrayList<Obj> objs1=new ArrayList<>();
        for (Obj obj : objs) {
            int [] result=canFit(obj,x,y,z);
            if (result!=null){
                objs1.add(obj);
            }

        }
        return objs1;
    }

    public static int[] canFit(Obj obj, int x, int y, int z ) {
        int[] result;
        if (obj.isBox() ) {
            result=canFitIsBox(obj,x,y,z);
        } else {
            result=canFitIsNotBox(obj,x,y,z);
        }
        return result;
    }

    public static int[] canFitIsBox(Obj obj, int x, int y, int z) {
        int objX = obj.getSizes().getX();
        int objY = obj.getSizes().getY();
        int objZ = obj.getSizes().getZ();
        int[][] sizes = {
                {objX, objY, objZ},
                {objY, objX, objZ},


        };
        for (int i = 0; i < 2; i++) {
            if (sizes[i][0] <= x && sizes[i][1] <= y && sizes[i][2] <= z) {
                return sizes[i];
            }
        }
        return null;
    }

    public static int[] canFitIsNotBox(Obj obj, int x, int y, int z) {
        int objX = obj.getSizes().getX();
        int objY = obj.getSizes().getY();
        int objZ = obj.getSizes().getZ();
        int[][] sizes = {
                {objX, objY, objZ},
                {objX, objZ, objY},
                {objY, objX, objZ},
                {objY, objZ, objX},
                {objZ, objX, objY},
                {objZ, objY, objX}
        };
        for (int i = 0; i < 6; i++) {
            if (sizes[i][0] <= x && sizes[i][1] <= y && sizes[i][2] <= z) {
                return sizes[i];
            }
        }
        return null;
    }


}