import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVENMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));


        mappables.add(new UtilityLine("College st", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Bld", UtilityType.WATER));

        for (Mappable m : mappables) {
            Mappable.mapIt(m);
        }



    }


}
