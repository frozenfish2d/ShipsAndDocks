package com.company;


import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        Sea sea = new Sea();
        Tunnel tunnel = new Tunnel(sea);
        Dock dock1 = new Dock(tunnel);
        Dock dock2 = new Dock(tunnel);
        Dock dock3 = new Dock(tunnel);
        ShipGenerator shipGenerator = new ShipGenerator(sea);
        shipGenerator.start();
        tunnel.start();
        dock1.start();
        dock2.start();
        dock3.start();
        //tunnel.addShip(sea.pullShip());

    }
}
