package kramer;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Bentley", 60);
        Car c2 = new Car("Toyota Prius", 35);
        Car c3 = new Car("Ferrari", 95);
        Car c4 = new Car("Skoda", 15);

        long patience = 1000 * 3;

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        //c1.countDown();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        /*while(t4.isAlive()){
            if((c4.getRaceDuration() - c4.getRaceStart()) > patience){
                //System.out.println("ræsstart: " + c1.getRaceDuration());
                //System.out.println("ræs: " + c1.getRaceStart());
                //System.out.println("tålmodighed: " + patience);
                t4.interrupt();
                t4.interrupt();
                //System.out.println(c4.getName() + " var for langsom og er ude af ræset!");
            }
        }*/

    }
}
