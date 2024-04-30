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
                break;
                case SOUTH:
                    return Point.EAST;
                break;
                case EAST:
                    return Point.NORTH;
                break;
                case WEST:
                    return Point.SOUTH;
                break;
                default:
                    break;
            }
        } else if (direction == Direction.RIGHT) {
            switch (point) {
                case NORTH:
                    return Point.EAST;
                    break;
                case SOUTH:
                    return Point.WEST;
                    break;
                case EAST:
                    return Point.SOUTH;
                    break;
                case WEST:
                    return Point.NORTH;
                    break;
                default:
                    break;
            }
        }
    }
}
