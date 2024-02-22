package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            developers.add(developerFactory.getDeveloperBySpeciality("java"));
        }
        for (int i = 0; i < 2; i++) {
            developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
        }

        developers.get(0).writeCode(new IntelliJ());
        developers.get(1).writeCode(new Eclipse());
        developers.get(2).writeCode(new VSCode());
        developers.get(3).writeCode(new VSCode());
    }
}
