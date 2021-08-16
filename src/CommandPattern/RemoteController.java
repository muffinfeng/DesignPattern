package CommandPattern;

public class RemoteController {

    public Command[] onCommands;
    public Command[] offCommands;

    public Command undoCommand;

    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i = 0; i < 5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int index, Command onCommand, Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonPush(int index){
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void offButtonPush(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void fallback(){
        undoCommand.fallback();
    }
}
