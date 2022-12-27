package com.learning.java.utils.Enumerations;

enum Direction {
    NORTH(180),
    EAST(45),
    SOUTH(360),
    WEST(90);
    int no;

    Direction(int i) {
        no = i;
    }
}

public class EnumExample {
    public static void main(String[] args){

        Direction north = Direction.NORTH;
        System.out.println(north + " : "+north.no);
        Direction south = Direction.valueOf("SOUTH");
        System.out.println(south + " : "+south.no);
    }
}
