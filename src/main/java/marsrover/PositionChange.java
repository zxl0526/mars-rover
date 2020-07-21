package marsrover;

public class PositionChange {

    public static MarsRoverPosition change(MarsRoverPosition marsRoverPosition, String command) {
        int x = marsRoverPosition.getCoordinatesX();
        int y = marsRoverPosition.getCoordinatesY();
        Direction direction = marsRoverPosition.getDirection();
        if (Command.MOVE.getShortName().equals(command)) {
            String directionShortName = marsRoverPosition.getDirection().getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                ++y;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                ++x;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                --x;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                --y;
            }
        }

        if (Command.BACK.getShortName().equals(command)) {
            String directionShortName = marsRoverPosition.getDirection().getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                --y;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                --x;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                ++x;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                ++y;
            }
        }


        if (Command.TURN_LEFT.getShortName().equals(command)) {

            direction = direction.leftDirection();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            direction = direction.rightDirection();
        }

        return new MarsRoverPosition(x, y, direction.getShortName());

    }
}