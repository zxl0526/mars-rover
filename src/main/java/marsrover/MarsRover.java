package marsrover;

import java.util.Arrays;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;
    private boolean isBack;
    private boolean isFast;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
        isBack = false;
        isFast = false;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return getMarsRoverPosition();
    }

    private void receiveSingleCommand(String command) {
        execute(command);
    }

//    public void execute(String command) {
//        int x = marsRoverPosition.getCoordinatesX();
//        int y = marsRoverPosition.getCoordinatesY();
//        Direction direction = marsRoverPosition.getDirection();
//
//        if (Command.MOVE.getShortName().equals(command)) {
//            String directionShortName = marsRoverPosition.getDirection().getShortName();
//            int times = isFast ? 2 : 1;
//            for (int i = 0; i < times; i++) {
//                if (directionShortName.equals(Direction.NORTH.getShortName())) {
//                    y = isBack ? --y : ++y;
//                } else if (directionShortName.equals(Direction.EAST.getShortName())) {
//                    x = isBack ? --x : ++x;
//                } else if (directionShortName.equals(Direction.WEST.getShortName())) {
//                    x = isBack ? ++x : --x;
//                } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
//                    y = isBack ? ++y : --y;
//                }
//            }
//        }
//
//        if (Command.TURN_LEFT.getShortName().equals(command)) {
//
//            direction = direction.leftDirection();
//        }
//        if (Command.TURN_RIGHT.getShortName().equals(command)) {
//            direction = direction.rightDirection();
//        }
//        if (Command.BACK.getShortName().equals(command)) {
//            isBack = !isBack;
//        }
//        if (Command.FAST.getShortName().equals(command)) {
//            isFast = !isFast;
//        }
//
//        resetMarsRoverPosition(new MarsRoverPosition(x, y, direction.getShortName()));
//    }

    public void execute(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            int times = isFast ? 2 : 1;
            for (int i = 0; i < times; i++) {
                if (isBack) {
                    marsRoverPosition = PositionChange.change(marsRoverPosition, "B");
                } else {
                    marsRoverPosition = PositionChange.change(marsRoverPosition, command);
                }
            }
        }

        if (Command.TURN_LEFT.getShortName().equals(command) || Command.TURN_RIGHT.getShortName().equals(command)) {
            if (isFast) {
                if (isBack) {
                    marsRoverPosition = PositionChange.change(marsRoverPosition, "B");
                } else {
                    marsRoverPosition = PositionChange.change(marsRoverPosition, "M");
                }
            }
            marsRoverPosition = PositionChange.change(marsRoverPosition, command);
        }

        if (Command.BACK.getShortName().equals(command)) {
            isBack = !isBack;
        }
        if (Command.FAST.getShortName().equals(command)) {
            isFast = !isFast;
        }
    }

}
