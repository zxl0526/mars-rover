package marsrover;

public enum Command {
    MOVE("M"), TURN_LEFT("L"), TURN_RIGHT("R"),BACK("B"),FAST("F");

    private String shortName;

    Command(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
