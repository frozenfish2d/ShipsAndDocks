package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tunnel {
    private final int tunnelSize = 5;

    List<Ship> ships = new ArrayList<>(tunnelSize);


    Sea sea;

    Tunnel(Sea sea) {
        this.sea = sea;

    }

    void getIntoTunnel() {
        if (ships.listIterator().hasNext())
            ships.add(sea.pullShip());
    }


}
