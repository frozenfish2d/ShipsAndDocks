package com.company;

import javax.print.Doc;

public class Dock extends Thread {
    Tunnel tunnel;

    Ship ship;

    Dock(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    private synchronized void getShipFromTunnel() {
        ship = tunnel.pullShipToDock();
    }

    @Override
    public void run() {
        while (true) {
            if (ship == null) {
                try {
                    Thread.sleep(1);
                    getShipFromTunnel();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                switch (ship.type) {
                    case 0:
                        loading(10, 1000);
                        break;
                    case 1:
                        loading(5, 500);
                        break;
                    case 2:
                        loading(1, 100);
                        break;
                    case 3:
                        loading(20, 2000);
                        break;
                    default:
                        break;
                }

            }

        }
    }

    private void loading(int counter, int timeout) {
        int load = 0;
        while (load + counter < ship.size) {
            try {
                load += counter;
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Номер дока:" + Thread.currentThread().getName());
        System.out.println("Объем корабля:" + ship.size + " Тип корабля:" + ship.type );
        System.out.println("Объем загрузки за один шаг:" + counter + " Задержка между партиями загрузки (мс):" + timeout);
        System.out.println("Заполнен на:" + load);
        System.out.println();
        ship = null;
    }
}
