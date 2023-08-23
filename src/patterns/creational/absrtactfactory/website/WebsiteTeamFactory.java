package patterns.creational.absrtactfactory.website;

import patterns.creational.absrtactfactory.Developer;
import patterns.creational.absrtactfactory.ProjectManager;
import patterns.creational.absrtactfactory.ProjectTeamFactory;
import patterns.creational.absrtactfactory.Tester;

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
