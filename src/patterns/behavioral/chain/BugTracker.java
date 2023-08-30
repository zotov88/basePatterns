package patterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleReportNotifier(NotifierLevel.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(NotifierLevel.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(NotifierLevel.ASAP);

        simpleNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        simpleNotifier.notifyManager(NotifierMessage.ROUTINE, NotifierLevel.ROUTINE);
        System.out.println("=======================================================");
        simpleNotifier.notifyManager(NotifierMessage.IMPORTANT, NotifierLevel.IMPORTANT);
        System.out.println("=======================================================");
        simpleNotifier.notifyManager(NotifierMessage.ASAP, NotifierLevel.ASAP);
    }
}
