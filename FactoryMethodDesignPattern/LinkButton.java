package FactoryMethodDesignPattern;

public class LinkButton implements Button{
    private ButtonType type = ButtonType.LINK;
    @Override
    public void onClick() {
        System.out.println("Link button is clicked");
    }
}
