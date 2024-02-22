package patterns.behavioral.chain;

public abstract class Notifier {

    private final int priority;
    private Notifier next;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notifyManager(String message, int levelPriority) {
        if (levelPriority >= priority) {
            write(message);
        }
        if (next != null) {
            next.notifyManager(message, levelPriority);
        }
    }

    public abstract void write(String message);
}
