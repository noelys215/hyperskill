public class Main {
    public static void main(String[] args) {
        boolean condition = true;
        evaluateCondition(condition);
    }

    static void evaluateCondition(boolean condition) {
        if (condition)
            System.out.println("Condition is true.");
        else
            System.out.println("Condition is false.");
    }
}
