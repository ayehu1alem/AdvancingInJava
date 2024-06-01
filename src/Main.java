/*
 * INTERFACES
 * are not a part of class hierarchy. Rather, they are just the declaration of methods
 * which can be accessed by some classes, in your preference. That is mean, we can define what kind of operations
 * an object can perform as it is defined by the classes that implement the interface.
 *
 * Any method declared without a body,  is really implicitly declared both public and abstract
 *       = Modifier protected is not allowed in the interfaces
 *       = Any field declared in the interface are not fields, they implicitly are public, static and final => Constants
 *
 * Interfaces can't be instantiated, but may contain a mix of methods declared with or without implementation
 * All methods on interfaces, declared without a method body are automatically public and abstract
 *
 * An interface can extend another interface
 * After JDK 8 =====> "default" keyword used for background compatibility
 *             =====>  private commonly used when default method share common code
 *
 * INTERFACES ===> Form a contract between the class and the Outside world
 *            ===> This contract is enforced at build time, by the compiler.
 *
 * Interfaces decouples the "What", from the "How" and is used to make different types, behave in similar ways.
 *
 * When to Use interfaces
 *   ===> When two unrelated class, own Comparable and Cloneable features
 *   ===> to specify the behaviour of a particular data type, but not concerned who implements its behaviour
 *   ===> to separate different behaviour
 *
 * interfaces are bases for lambda expressions
 */


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
