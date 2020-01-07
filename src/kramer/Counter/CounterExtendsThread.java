package kramer.Counter;

public class CounterExtendsThread extends Thread{

    private int counter = 0;

    public void run(){
        counter++;
        System.out.println("ExtendsThreadCounter: " + counter);
    }
}


