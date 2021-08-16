package CommandPattern;

public class TVOnCommand implements Command{

    public TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void fallback() {
        tvReceiver.off();
    }
}
