package patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {

        Project master = new Project(1, "Project", "SourceCode src = new SourceCode();");
        System.out.println(master);

        System.out.println("===========================================================================");

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println(masterClone);

    }
}
