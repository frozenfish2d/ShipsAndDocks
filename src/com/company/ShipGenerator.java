package com.company;

public class ShipGenerator extends Thread {

    private final Sea sea;

    ShipGenerator(Sea sea) {
        this.sea = sea;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            sea.add(new Ship(50 + (int) (Math.random() * 100), (int) (Math.random() * 4)));
        }
    }
}
