package PrototypePattern;

public class Main {
    public static void main(String[] args) {

        // Step 4: Create the original BackgroundObject Prototype

        BackgroundObject prototype = new BackgroundObject(10, 20, 30, BackgroundObjectType.TRESS);
        prototype.display();

        // Step 5: Clone the original prototype

        BackgroundObject clone = (BackgroundObject) prototype.clone();

        // Step 6: Modify the cloned prototype
        clone.setX(100);
        clone.setY(200);
        clone.setZ(300);
        clone.setType(BackgroundObjectType.MOUNTAIN);

        clone.display();
    }
}
