package patterns.behavioral.mediator;

public interface Chat {

    void setAdmin(User user);

    void addUserToChat(User user);

    void sendMessage(String message, User user);
}
