public class QuitCommand implements Command {
    public QuitCommand() {

    }
    public void execute() {
        System.out.println("Game over :(");
    }
}