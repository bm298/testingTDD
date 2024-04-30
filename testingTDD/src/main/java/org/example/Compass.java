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

//        if (point == Point.NORTH && direction==Direction.RIGHT){
//            System.out.println("condition met");
//            return Point.EAST;
        
        if (direction == Direction.LEFT) {
            switch (point) {
                case NORTH:
                    return Point.WEST;

                case SOUTH:
                    return Point.EAST;

                case EAST:
                    return Point.NORTH;

                case WEST:
                    return Point.SOUTH;

                default:
                    break;
            }
        } else if (direction == Direction.RIGHT) {
            switch (point) {
                case NORTH:
                    return Point.EAST;

                case SOUTH:
                    return Point.WEST;

                case EAST:
                    return Point.SOUTH;

                case WEST:
                    return Point.NORTH;

                default:
                    break;
            }
        }
        return point;
    }
}
