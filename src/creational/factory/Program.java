package creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory getDeveloperFactoryBySpeciality(final String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown");
        }
    }
}
