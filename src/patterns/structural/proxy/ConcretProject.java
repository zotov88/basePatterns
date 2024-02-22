package patterns.structural.proxy;

public class ConcretProject implements Project {

    private final String url;

    public ConcretProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
