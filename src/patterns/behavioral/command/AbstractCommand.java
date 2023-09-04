package patterns.behavioral.command;

public abstract class AbstractCommand implements Command {

    protected Remote remote;

    public AbstractCommand(Remote remote) {
        this.remote = remote;
    }

}
