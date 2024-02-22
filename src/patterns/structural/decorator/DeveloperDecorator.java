package patterns.structural.decorator;

public class DeveloperDecorator implements Developer {

    private final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
