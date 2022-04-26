package colleaguesimulator;

import java.util.*;
import java.util.stream.IntStream;

public class ColleagueSimulator {
    private static final Random RANDOM = new Random();
    private static final List<Position> POSITIONS = Arrays.asList(
            new Position(48.851585, 2.343574),
            new Position(48.851162, 2.345335),
            new Position(48.849524, 2.337390),
            new Position(48.839667, 2.348083),
            new Position(48.840373, 2.339366),
            new Position(48.840628, 2.328716),
            new Position(48.838198, 2.327213),
            new Position(48.834950, 2.327170),
            new Position(48.833848, 2.316777),
            new Position(48.842012, 2.308060)
    );
    public static void main(String[] args) {
        int nbOfColleague = 10;

        List<Colleague> colleagues = IntStream.range(0, nbOfColleague).mapToObj(operand -> buildColleague()).toList();
        var timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Colleague colleague = getRandomColleague(colleagues);
                publishColleague(colleague);
            }
        }, 0, 5000);
    }

    private static Colleague buildColleague() {
        return new Colleague(UUID.randomUUID().toString(), getRandomPosition());
    }

    private static void publishColleague(Colleague colleague) {
        System.out.printf("Publishing %s \n", colleague);
    }

    private static Colleague getRandomColleague(List<Colleague> uuids) {
        return uuids.get(RANDOM.nextInt(uuids.size()));
    }

    private static Position getRandomPosition() {
        return POSITIONS.get(RANDOM.nextInt(POSITIONS.size()));
    }
}
