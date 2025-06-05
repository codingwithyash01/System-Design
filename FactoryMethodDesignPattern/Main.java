package FactoryMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new PrimaryButtonFactory();
        Button primary= buttonFactory.createButton();
        primary.onClick();
    }
}
