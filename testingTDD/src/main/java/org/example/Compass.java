package org.example;

public class Compass {

    public enum Point{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public enum Direction{
        LEFT,
        RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction){

        if (point == Point.NORTH && direction==Direction.RIGHT){
            System.out.println("condition met");
            return Point.EAST;
        }
        return point;
    }

}
