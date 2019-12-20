package com.company;

public class ShipGenerator extends Thread {
    private final Sea sea;


    private int count = 0;

    ShipGenerator(Sea sea) {
        this.sea = sea;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            sea.add(new Ship(50 + (int) (Math.random() * 50), (int) (Math.random() * 3)));
            count++;

        }
    }
}
