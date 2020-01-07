package kramer.Counter;

public class CounterImplementsRunnable implements Runnable {

    private int counter = 0;

    public void run(){
        counter++;
        System.out.println("ImplementsRunnableCounter: " + counter);
    }
}


