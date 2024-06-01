


public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        inFlight(flier);
        System.out.println();

        inFlight(new Jet());

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles.", kmsTraveled, milesTraveled);

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracked){
            tracked.track();
        }

        if(flier instanceof Animal animal){
            animal.move();
        }

        flier.land();
    }


}
