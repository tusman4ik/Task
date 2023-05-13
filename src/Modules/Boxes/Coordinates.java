package Modules.Boxes;

public class Coordinates {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public int[] getCoordsArray(){
        return new int[]{getX(),getY(),getZ()};
    }

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Coordinates(Coordinates coordinates) {
        this.x = coordinates.getX();
        this.y = coordinates.getY();
        this.z = coordinates.getZ();
    }

}
