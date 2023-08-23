package creational.absrtactfactory.banking;

import creational.absrtactfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Write Java code.");
    }
}
