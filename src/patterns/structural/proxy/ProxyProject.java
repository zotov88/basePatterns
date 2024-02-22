package patterns.structural.proxy;

public class ProxyProject implements Project {

    private final String url;
    private ConcretProject concretProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (concretProject == null) {
            concretProject = new ConcretProject(url);
        }
        concretProject.load();
    }
}
