package com.company;


import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        Sea sea = new Sea();
        Tunnel tunnel = new Tunnel(sea);
        ShipGenerator shipGenerator = new ShipGenerator(sea);
        shipGenerator.start();
        tunnel.start();
        tunnel.addShip(sea.pullShip());

    }
}
