package patterns.structural.proxy;

public class App {
    public static void main(String[] args) {

        Project project = new ProxyProject("https://www.github.com/zotov88/concreaproject");
        project.run();
    }
}
