package patterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {

        ProgramLogger.getInstance().addLogFile("First log");
        ProgramLogger.getInstance().addLogFile("Second log");
        ProgramLogger.getInstance().showLogFile();
    }
}
