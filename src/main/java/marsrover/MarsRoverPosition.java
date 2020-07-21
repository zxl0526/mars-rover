package marsrover;


public class MarsRoverPosition {
    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = Direction.fromShortName(direction);
    }

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }
    public Direction getDirection(){
        return direction;
    }

}
