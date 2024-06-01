
//Class can implement many interfaces
//But a class can only extend single class --> Single Inheritance

public class Bird extends Animal implements FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println("Flaps wings");
    }


    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is take off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s track is recorded");
    }
}
