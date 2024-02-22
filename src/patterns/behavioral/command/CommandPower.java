package patterns.behavioral.command;

public class CommandPower extends AbstractCommand {

    public CommandPower(Remote remote) {
        super(remote);
    }

    @Override
    public void execute() {
        remote.power();
    }
}
