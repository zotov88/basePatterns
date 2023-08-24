package patterns.structural.bridge;

public class GameProject extends Program {

    protected GameProject(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Start game develop");
        developer.writeCode();
    }
}
