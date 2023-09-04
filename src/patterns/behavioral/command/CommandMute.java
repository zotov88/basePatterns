package patterns.behavioral.command;

public class CommandMute extends AbstractCommand {

    public CommandMute(Remote remote) {
        super(remote);
    }

    @Override
    public void execute() {
        remote.mute();
    }
}
