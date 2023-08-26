package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            developers.add(developerFactory.getDeveloperBySpeciality("java"));
        }
        for (int i = 0; i < 3; i++) {
            developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
        }

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
