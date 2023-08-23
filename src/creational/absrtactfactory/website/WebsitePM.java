package creational.absrtactfactory.website;

import creational.absrtactfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Manage website.");
    }
}
