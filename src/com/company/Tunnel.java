package com.company;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tunnel extends Thread {
    private final int tunnelSize = 5;

    List<Ship> ships = new ArrayList<>(tunnelSize);


    Sea sea;

    Tunnel(Sea sea) {
        this.sea = sea;

    }




    void getIntoTunnel() {
        if (ships.size()>tunnelSize)
            ships.add(sea.pullShip());
    }


}
