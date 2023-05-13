package Modules.Boxes;

import java.util.HashMap;

public class BoxesSize {

    private static HashMap<Integer, int[]> createBoxesSizeTable() {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        int [][] sizes=getBoxesSizeTable();
        int[] weights = {400, 300, 250, 180, 150, 110, 80, 50};

        for (int i = 0; i < sizes.length; i++) {
            int[] value = new int[4];
            value[0] = sizes[i][0];
            value[1] = sizes[i][1];
            value[2] = sizes[i][2];
            value[3] = weights[i];
            hashMap.put(i, value);
        }
        return hashMap;
    }
    public static int[] getInsideBoxesSizeTable(int i) {
        if (i < 0 || i > 7) {
            throw new IndexOutOfBoundsException("ThereIsNoSuchBox");
        }
        int[] sizes= getBoxesSizeTable()[i];
        return new int[]{sizes[0]-4,sizes[1]-4,sizes[2]-4};
    }
    public static int[] getBoxesSizeTable(int i) {
        if (i < 0 || i > 7) {
            throw new IndexOutOfBoundsException("ThereIsNoSuchBox");
        }
        return getBoxesSizeTable()[i];
    }

    private static int[][] getBoxesSizeTable() {
        int[][] sizes = {
                {841, 1189, 300},
                {841, 594, 270},
                {420, 594, 240},
                {420, 297, 210},
                {210, 297, 180},
                {210, 148, 150},
                {105, 148, 130},
                {105, 74, 80}
        };
        return sizes;
    }

    public static int[] getBoxesSizesAndWeightTable(int i) {
        if (i < 0 || i > 7) {
            throw new IndexOutOfBoundsException("ThereIsNoSuchBox");
        }
        return createBoxesSizeTable().get(i);
    }
}
