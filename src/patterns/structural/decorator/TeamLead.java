package patterns.structural.decorator;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to client.\n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
