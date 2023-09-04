package patterns.behavioral.command;

public class CommandHome extends AbstractCommand {

    public CommandHome(Remote remote) {
        super(remote);
    }

    @Override
    public void execute() {
        remote.home();
    }
}
