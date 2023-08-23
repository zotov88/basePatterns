package patterns.creational.builder;

public abstract class WebsiteBuilder {

    protected Website website;

    public void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();

    public abstract void buildCms();

    public abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }

}
