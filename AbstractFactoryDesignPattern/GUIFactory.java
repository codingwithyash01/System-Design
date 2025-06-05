package AbstractFactoryDesignPattern;

// Step 3: Create Abstract Factory

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
