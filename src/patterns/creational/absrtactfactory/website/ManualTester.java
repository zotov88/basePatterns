package patterns.creational.absrtactfactory.website;

import patterns.creational.absrtactfactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual test website.");
    }
}
