package FactoryMethodDesignPattern;

// Step 4: Create the factory subclasses

public class PrimaryButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
