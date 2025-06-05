package AbstractFactoryDesignPattern;

public class Main {
    private static GUIFactory factory = new WindowsFactory();

    public static void main(String[] args) {
        Button button = factory.createButton();
        button.onClick();
        Checkbox checkbox = factory.createCheckBox();
        checkbox.onSelect();
    }
}
