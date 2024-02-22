package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            if (speciality.equalsIgnoreCase("java")) {
                System.out.println("Create java developer");
                developer = new JavaDeveloper();
            }
            if (speciality.equalsIgnoreCase("cpp")) {
                System.out.println("Create cpp developer");
                developer = new CppDeveloper();
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
