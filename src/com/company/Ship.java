package com.company;

public class Ship {

    public final int size;
    public final int type;
    private int total = 0;

    public int getTotal() {
        return total;
    }



    Ship(int size, int type){
        this.size = size;
        this.type = type;
    }

}
