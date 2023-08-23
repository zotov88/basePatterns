package patterns.creational.absrtactfactory;

import patterns.creational.absrtactfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
