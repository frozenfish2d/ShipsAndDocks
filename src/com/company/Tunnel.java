package com.company;

import java.util.ArrayList;
import java.util.List;


class Tunnel extends Thread {
    private final int tunnelSize = 5;

    List<Ship> ships = new ArrayList<>(tunnelSize);


    void addShip(Ship ship){
        ships.add(ship);
    }


    Sea sea;

    Tunnel(Sea sea) {
        this.sea = sea;

    }

    private void getIntoTunnel() {
        if (ships.size() <= tunnelSize)
            ships.add(sea.pullShip());
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                getIntoTunnel();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
