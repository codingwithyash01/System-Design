package AbstractFactoryDesignPattern;
// Step 2: Create the concrete product subclasses

public class WindowsButton implements Button{

    @Override
    public void onClick() {
        System.out.println("Windows button is clicked");
    }
}
