package patterns.structural.facade;

public class Workflow {

    private Job job = new Job();
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
