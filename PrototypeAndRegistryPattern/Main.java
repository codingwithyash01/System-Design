package PrototypeAndRegistryPattern;

public class Main {
    private static PrototypeRegistry registry = new PrototypeRegistry();
    public static void main(String[] args) {
        BackgroundObject prototype = new BackgroundObject(10, 20, 30, BackgroundObjectType.TREE);
        prototype.display();

        registry.register(prototype);

        BackgroundObject clone = (BackgroundObject) prototype.clone();
        clone.setX(100);
        clone.setY(200);
        clone.setZ(300);
        clone.setType(BackgroundObjectType.MOUNTAIN);
        clone.display();

        // Calling the createTrees method here

        createTrees();
    }

    public static void createTrees(){
        BackgroundObject prototype = registry.getPrototype(BackgroundObjectType.TREE);
        BackgroundObject clone = (BackgroundObject) prototype.clone();
        clone.setX(1000);
        clone.setY(2000);
        clone.setZ(3000);
        clone.setType(BackgroundObjectType.BUILDING);
        clone.display();
    }
}
