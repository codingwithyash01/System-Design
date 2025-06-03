package SimpleFactoryDesignPattern;

// Step 3: Create the Button Factory

public class ButtonFactory {
   static Button createButton(ButtonType type) {
        switch (type) {
            case PRIMARY:
                return new PrimaryButton();
            case SECONDARY:
                return new SecondaryButton();
            case LINK:
                return new LinkButton();
        }
        throw new RuntimeException("Invalid Type: " + type);
    }
}
