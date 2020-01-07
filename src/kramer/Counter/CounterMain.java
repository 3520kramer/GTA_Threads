package kramer.Counter;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {

        CounterExtendsThread cet1 = new CounterExtendsThread();
        cet1.start();
        cet1.sleep(500);

        CounterExtendsThread cet2 = new CounterExtendsThread();
        cet2.start();
        cet2.sleep(500);

        CounterExtendsThread cet3 = new CounterExtendsThread();
        cet3.start();
        cet3.sleep(500);


        CounterImplementsRunnable cir = new CounterImplementsRunnable();

        Thread t1 = new Thread(cir);
        t1.start();
        t1.sleep(500);

        Thread t2 = new Thread(cir);
        t2.start();
        t2.sleep(500);

        Thread t3 = new Thread(cir);
        t3.start();
    }
}


