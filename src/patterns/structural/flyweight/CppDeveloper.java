package patterns.structural.flyweight;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode(IDE ide) {
        System.out.println("Write Cpp code with " + ide.getNameIdea());
    }
}
