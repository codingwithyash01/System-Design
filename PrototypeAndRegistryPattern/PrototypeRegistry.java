package PrototypeAndRegistryPattern;

import java.util.HashMap;

public class PrototypeRegistry {
    HashMap<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();

    public void register(BackgroundObject object) {
        registry.put(object.getType(), object);
    }

    public BackgroundObject getPrototype(BackgroundObjectType type) {
        return registry.get(type);
    }
}
