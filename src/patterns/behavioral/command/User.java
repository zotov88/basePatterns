package patterns.behavioral.command;

import java.util.List;

public class User {

    private final List<Command> commands;

    public User(List<Command> commands) {
        this.commands = commands;
    }

    public void pushPower() {
        commands.get(0).execute();
    }

    public void pushHome() {
        commands.get(1).execute();
    }

    public void pushMute() {
        commands.get(2).execute();
    }

    public void pushBack() {
        commands.get(3).execute();
    }
}
