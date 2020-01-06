package kramer;

import java.util.Random;

public class Car implements Runnable {
    private String name;
    private int hp;
    private long raceStart;
    private long raceDuration;
    private boolean cancel;
    long patience = 1000 * 15; //1000 ms = 1 minut

    public Car(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public long getRaceStart() {
        return raceStart;
    }

    public long getRaceDuration() {
        return raceDuration;
    }

    public void cancel() {
        this.cancel = true;
    }

    public void countDown() {
        for (int i = 5; i > 0; i--) {

            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("KØR!\n");
    }

    @Override
    public void run() {
        this.raceStart = System.currentTimeMillis();

        Random random = new Random();
        int hpBoost = random.nextInt(20);
        this.hp += hpBoost;
        System.out.println(name + " har fået " + hpBoost + " i boost!\n");

        // For Loop som styrer hvor lang tid det tager en bil at køre 100 meter ud fra dens hestekræfter
        for (int i = 100; i <= 500; i += 100) {
            try {
                if (hp <= 20) {
                    Thread.sleep(5000);
                } else if (hp <= 40) {
                    Thread.sleep(4000);
                } else if (hp <= 60) {
                    Thread.sleep(3000);
                } else if (hp <= 80) {
                    Thread.sleep(2000);
                } else {
                    Thread.sleep(1000);
                }
                this.raceDuration = System.currentTimeMillis();


                if ((raceDuration - raceStart) > patience) {
                    cancel = true;
                    System.out.println(name + " var for langsom og er ude af ræset!");
                    break;
                }

            } catch (InterruptedException e) {
                System.out.println(name + " var for langsom og er ude af ræset!");
            }
            if (i < 500 && !cancel) {
                System.out.println(name + " har kørt " + i + " meter");

            } else if (i == 500 && !cancel) {
                System.out.println("\n" + name + " er i mål!!\n");
            }
        }
    }
}
