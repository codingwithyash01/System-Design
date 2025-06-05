package AbstractFactoryDesignPattern;

public class WindowsCheckBox implements Checkbox{

    @Override
    public void onSelect() {
        System.out.println("Windows checkbox is selected");
    }
}
