package FactoryMethodDesignPattern;

public class SecondaryButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new SecondaryButton();
    }
}
