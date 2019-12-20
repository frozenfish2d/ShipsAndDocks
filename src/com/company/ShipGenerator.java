package com.company;

public class ShipGenerator extends Thread {
    private final Sea sea;


    private int count = 0;

    ShipGenerator(Sea sea) {
        this.sea = sea;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                sea.add(new Ship((int) (Math.random() * 100), (int) (Math.random() * 3)));
                count++;
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
