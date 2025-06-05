package AbstractFactoryDesignPattern;

public class MacButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Mac button is clicked");
    }
}
