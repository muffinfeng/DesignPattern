package visitorPattern;

public class Client {
    public static void main(String[] args) {
        ActionStructure actionStructure = new ActionStructure();

        actionStructure.attach(new Man());
        actionStructure.attach(new Woman());

        Success action = new Success();
        actionStructure.display(action);

    }
}
