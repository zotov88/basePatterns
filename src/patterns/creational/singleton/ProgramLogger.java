package patterns.creational.singleton;

public class ProgramLogger {

    private static ProgramLogger programLogger;

    private static String logFile = "This is log file\n";

    private ProgramLogger() {

    }

    public static synchronized ProgramLogger getInstance() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogFile(final String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }


}
