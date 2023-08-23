package creational.absrtactfactory.website;

import creational.absrtactfactory.Developer;
import creational.absrtactfactory.ProjectManager;
import creational.absrtactfactory.ProjectTeamFactory;
import creational.absrtactfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
