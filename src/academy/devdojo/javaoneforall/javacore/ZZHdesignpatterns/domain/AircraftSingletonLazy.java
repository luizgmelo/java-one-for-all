package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    // Lazy Initialization
    private static volatile AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    return new AircraftSingletonLazy("987-900");
                }
            }
        }
        return INSTANCE;
    }
}
