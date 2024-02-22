package patterns.structural.decorator;

public class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.\n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
