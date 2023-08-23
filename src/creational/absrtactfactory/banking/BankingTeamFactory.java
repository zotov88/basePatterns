package creational.absrtactfactory.banking;

import creational.absrtactfactory.Developer;
import creational.absrtactfactory.ProjectManager;
import creational.absrtactfactory.ProjectTeamFactory;
import creational.absrtactfactory.Tester;

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
