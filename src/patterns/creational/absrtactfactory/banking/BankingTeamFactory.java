package patterns.creational.absrtactfactory.banking;

import patterns.creational.absrtactfactory.Developer;
import patterns.creational.absrtactfactory.ProjectManager;
import patterns.creational.absrtactfactory.ProjectTeamFactory;
import patterns.creational.absrtactfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
