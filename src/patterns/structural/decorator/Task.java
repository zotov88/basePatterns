package patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {

        Developer developer = new TeamLead(new SeniorDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
