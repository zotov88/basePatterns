package patterns.creational.absrtactfactory.website;

import patterns.creational.absrtactfactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
