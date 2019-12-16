package com.company;

import java.util.*;

public class Sea {
    private final int seaSize = 10;
    private List<Ship> shipList = new ArrayList<>();

    void add(Ship ship) {
        if (shipList.size() < seaSize) {
            shipList.add(ship);
            System.out.println("Ship added into the sea");
        }
    }

    int getShipList() {
        return shipList.size();
    }


    Ship pullShip() {
        if (shipList.listIterator().hasNext()) {
            System.out.println("add ship into tunnel");
            shipList.remove(0);
            return shipList.listIterator().next();

        } else return null;
    }

}
