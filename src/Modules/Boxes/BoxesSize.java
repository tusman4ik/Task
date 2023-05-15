package Modules.Boxes;

import java.util.HashMap;

public class BoxesSize {

    private static HashMap<Integer, int[]> createBoxesSizeTable() {

        int[][] boxParameters = {
                {841, 1189, 600, 800},
                {841, 1189, 300, 400},
                {841, 594, 270, 300},
                {420, 594, 240, 250},
                {420, 297, 210, 180},
                {210, 297, 180, 150},
                {210, 148, 150, 110},
                {105, 148, 130, 80},
                {105, 74, 80, 50}
        };

        HashMap<Integer, int[]> hashMap = new HashMap<>();
        for (int i = 0; i < boxParameters.length; i++) {
            hashMap.put(i, boxParameters[i]);
        }
        return hashMap;
    }
    public static int[] getParam(int i){
        return createBoxesSizeTable().get(i);
    }



}
