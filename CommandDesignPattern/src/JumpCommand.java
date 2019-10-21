public class JumpCommand implements Command {
    private Player player;
    public JumpCommand(Player player) { //a way to link the player to command
        this.player = player;
    }
    public void execute(){ //command
        player.jump();
    }
}
