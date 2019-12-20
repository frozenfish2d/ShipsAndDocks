package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Tunnel extends Thread {
    private final int tunnelSize = 5;

    List<Ship> ships = new ArrayList<>(tunnelSize);

    Sea sea;

    Tunnel(Sea sea) {
        this.sea = sea;

    }

    private void getIntoTunnel() {
        if (ships.size() < tunnelSize)
            ships.add(sea.pullShip());
    }

    synchronized Ship pullShipToDock() {
        Iterator<Ship> iterator = ships.iterator();
        Ship tmpShip = null;
        if (iterator.hasNext()) {
            //System.out.println("Ship going to dock");
            tmpShip = iterator.next();
            iterator.remove();

        }
        return tmpShip;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                getIntoTunnel();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
