package com.company;

import java.util.*;

public class Sea {

    private final static int SEA_SIZE = 10;

    private List<Ship> shipList = new ArrayList<>();

    void add(Ship ship) {
        if (shipList.size() < SEA_SIZE) {
            shipList.add(ship);
        }
    }

    Ship pullShip() {
        Iterator<Ship> iterator = shipList.iterator();
        Ship tmpShip = null;
        if (iterator.hasNext()) {
            tmpShip = iterator.next();
            iterator.remove();
        }
        return tmpShip;
    }

}
