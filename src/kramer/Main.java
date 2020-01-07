package kramer;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Car("Bentley", 60));
        Thread t2 = new Thread(new Car("Toyota", 35));
        Thread t3 = new Thread(new Car("Ferrari", 95));
        Thread t4 = new Thread(new Car("Skoda", 15));

        try {

            t1.start();
            t1.join();

            t2.start();

            t3.start();
            t3.join();

            t4.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

