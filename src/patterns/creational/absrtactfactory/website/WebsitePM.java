package patterns.creational.absrtactfactory.website;

import patterns.creational.absrtactfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Manage website.");
    }
}
