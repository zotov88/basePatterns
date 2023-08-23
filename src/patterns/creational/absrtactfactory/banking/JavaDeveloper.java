package patterns.creational.absrtactfactory.banking;

import patterns.creational.absrtactfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Write Java code.");
    }
}
