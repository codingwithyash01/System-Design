package FactoryMethodDesignPattern;

public class LinkButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new LinkButton();
    }
}
