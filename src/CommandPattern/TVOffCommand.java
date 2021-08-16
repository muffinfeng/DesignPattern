package CommandPattern;

public class TVOffCommand implements Command{

    public TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void fallback() {
        tvReceiver.on();
    }
}
