package com.company;

import java.util.*;

public class Sea {
    private final int seaSize = 1000;
    List<Ship> shipList = new ArrayList<>();

    void add(Ship ship) {
        if (shipList.size() < seaSize) {
            shipList.add(ship);
        }
    }

    int getShipList() {
        return shipList.size();
    }


    Ship pullShip() {
        if (shipList.listIterator().hasNext()) {
            return shipList.listIterator().next();

        } else return null;
    }

}
