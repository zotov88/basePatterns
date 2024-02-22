package patterns.creational.absrtactfactory.banking;

import patterns.creational.absrtactfactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manage banking project.");
    }
}
