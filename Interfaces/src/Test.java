public class Test {
    public static void main(String[] args) {
//        inFlight(new Jet());

//        OrbitEarth.log("Testing... " + new Satellite());

        orbit(new Satellite());


    }
    private static void orbit(OrbitEarth flier){
//        inFlight(flier);
//        System.out.println();

        flier.takeOff();
        flier.fly();
        flier.land();
    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
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
