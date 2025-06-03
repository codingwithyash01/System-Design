package SimpleFactoryDesignPattern;

public class SecondaryButton implements Button{
    private ButtonType type = ButtonType.SECONDARY;
    @Override
    public void onClick() {
        System.out.println("Secondary button is clicked");
    }
}
