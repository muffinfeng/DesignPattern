package visitorPattern;

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
