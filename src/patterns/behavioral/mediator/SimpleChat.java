package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(u -> u != user)
                .forEach(u -> u.getMessage(message));

        admin.getMessage(message);
    }
}
