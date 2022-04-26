package colleaguesimulator;

public class Colleague {
    private final String uuid;
    private final Position position;

    public Colleague(String uuid, Position position) {
        this.uuid = uuid;
        this.position = position;
    }

    public String getUuid() {
        return uuid;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "uuid='" + uuid + '\'' +
                ", position=" + position +
                '}';
    }
}
