package com.company;

import java.util.*;

public class Sea {
    private final int seaSize = 10;
    private List<Ship> shipList = new ArrayList<>();

    void add(Ship ship) {
        if (shipList.size() < seaSize) {
            shipList.add(ship);
            //System.out.println("Ship added into the sea");
        }
    }

    Ship pullShip() {
        Iterator<Ship> iterator = shipList.iterator();
        Ship tmpShip = null;
        if (iterator.hasNext()) {
            //System.out.println("add ship into tunnel");
            tmpShip = iterator.next();
            iterator.remove();
        }
        return tmpShip;
    }

}
