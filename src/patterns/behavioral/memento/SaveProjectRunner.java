package patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project version 1.0");
        project.setVersionAndDate("version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to GitHub");
        github.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");

        Thread.sleep(5000);

        project.setVersionAndDate("version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
