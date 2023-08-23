package patterns.creational.builder;

public class WebsiteRunner {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        System.out.println(director.buildWebsite());
    }
}
