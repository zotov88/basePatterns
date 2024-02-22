package patterns.behavioral.command;

public class CommandBack extends AbstractCommand {

    public CommandBack(Remote remote) {
        super(remote);
    }

    @Override
    public void execute() {
        remote.back();
    }
}
