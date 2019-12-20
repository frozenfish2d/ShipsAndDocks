package com.company;

import javax.print.Doc;

public class Dock extends Thread {
    Tunnel tunnel;

    Ship ship;

    Dock(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    private synchronized void  getShipFromTunnel() {
        ship = tunnel.pullShipToDock();
    }

    @Override
    public void run() {
        while (true) {
            if (ship == null) {
                try {
                    Thread.sleep(3000);
                    getShipFromTunnel();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    System.out.println("Ship size: " + ship.size +" Ship type: "+ ship.type);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
