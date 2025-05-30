package PrototypeAndRegistryPattern;

public class BackgroundObject implements GraphicalObject {
    private int x;
    private int y;
    private int z;
    private BackgroundObjectType type;

    public BackgroundObject(int x, int y, int z, BackgroundObjectType type) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public BackgroundObjectType getType() {
        return type;
    }

    public void setType(BackgroundObjectType type) {
        this.type = type;
    }

    @Override
    public GraphicalObject clone() {
        return new BackgroundObject(x,y,z,type);
    }

    public void display() {
        System.out.println("This is a " + type + " prototype at " + x + " " + y + " " + z);
    }
}
