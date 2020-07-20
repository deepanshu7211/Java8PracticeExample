package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        // Before Java 8
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(" Normal RUnnable with Java 7");
            }
        };

        new Thread(runnable).start();

        // With Java 8

        Runnable lamdaRunnable = () -> { System.out.println("With Java 8 Lambda");};
        new Thread(lamdaRunnable).start();

    }
}
