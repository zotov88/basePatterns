package patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    public void buildName() {
        website.setName("Enterprise");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10_000);
    }
}
