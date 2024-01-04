package org.example.ch7;

public class MusicMaking extends Event {
    public final String instrument;
    public MusicMaking(String instrument) {
        this.instrument = instrument;
    }

    public static int totalDurationOfNoNapEvents(Event... events) {
        int sum = 0;

        for (Event event: events) {
            if (!(event instanceof Nap))
                sum += event.duration;
        }

        return sum;
    }

    static boolean burnedSameCalories(Event event1, Event event2) {
        if (!(event1 instanceof Workout && event2 instanceof Workout))
            return false;

        Workout workout1 = (Workout) event1;
        Workout workout2 = (Workout) event2;

        return workout1.caloriesBurned == workout2.caloriesBurned;
    }



    public static void main(String[] args ) {

    }
}
