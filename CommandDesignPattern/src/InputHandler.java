public class InputHandler {
    private Command[] commands; //array of commands
    public InputHandler(Player player){
        commands = new Command[4];
        commands[0] = new JumpCommand(player);
        commands[1] = new FireCommand(player);
        commands[2] = new RunCommand(player);
        commands[3] = new QuitCommand();
    }
    public void buttonPressed(String button){
        if(button.equals("jump")) commands[0].execute();
        if(button.equals("fire")) commands[1].execute();
        if(button.equals("run")) commands[2].execute();
        if(button.equals("quit")) commands[3].execute();

    }
}
