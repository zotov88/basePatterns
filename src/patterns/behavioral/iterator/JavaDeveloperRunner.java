package patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {

        String[] skills = {"java", "spring", "postgreSQL", "Maven", "Hibernet"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Alexey", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills:");
        while (iterator.hasNext()) {
            System.out.printf("- %s\n", iterator.next().toString());
        }
    }
}
