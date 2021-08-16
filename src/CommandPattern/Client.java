package CommandPattern;

public class Client {

    public static void main(String[] args) {
        TVReceiver tvReceiver = new TVReceiver();

        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommands(0, tvOnCommand, tvOffCommand);

        remoteController.onButtonPush(0);
        remoteController.offButtonPush(0);
        remoteController.fallback();
    }
}
