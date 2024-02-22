package patterns.behavioral.mediator;

public class SimpleCharRunner {
    public static void main(String[] args) {

        Chat chat = new SimpleChat();

        User admin = new Admin(chat, "Admin");

        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("I am User 1");
        admin.sendMessage("I am Admin");
    }
}
