package patterns.structural.flyweight;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode(IDE ide) {
        System.out.println("Write java code with " + ide.getNameIdea());
    }
}
