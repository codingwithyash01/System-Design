package SimpleFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Button primaryButton = ButtonFactory.createButton(ButtonType.PRIMARY);
        primaryButton.onClick();
        Button secondaryButton = ButtonFactory.createButton(ButtonType.SECONDARY);
        secondaryButton.onClick();
        Button linkButton = ButtonFactory.createButton(ButtonType.LINK);
        linkButton.onClick();
    }
}
