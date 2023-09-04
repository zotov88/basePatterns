package patterns.behavioral.command;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Remote remote = new Remote();
        List<Command> commands = Arrays.asList(
                new CommandPower(remote),
                new CommandHome(remote),
                new CommandMute(remote),
                new CommandBack(remote));
        User user = new User(commands);

        user.pushPower();
        user.pushHome();
        user.pushBack();
        user.pushMute();
        user.pushMute();
        user.pushPower();
    }
}
