package SimpleFactoryDesignPattern;

// Step 2: Create the product subclasses

public class PrimaryButton implements Button{
    private ButtonType type = ButtonType.PRIMARY;
    @Override
    public void onClick() {
        System.out.println("Primary button is clicked");
    }
}
