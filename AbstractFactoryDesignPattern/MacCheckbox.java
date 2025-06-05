package AbstractFactoryDesignPattern;

public class MacCheckbox implements Checkbox{
    @Override
    public void onSelect() {
        System.out.println("Mac checkbox is selected");
    }
}
