package patterns.behavioral.interpreter;

public class InterpretRunner {
    public static void main(String[] args) {
        Expression isJavaCoreDeveloper = getJavaCoreExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println(isJavaCoreDeveloper.interpret("java"));
        System.out.println(isJavaEEDeveloper.interpret("java spring"));


    }

    private static Expression getJavaCoreExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");
        return new OrExpression(java, javaCore);
    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");
        return new AndExpression(java, spring);
    }
}
