import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> map = new ArrayList<>();
        map.add(new Building("Bahir Dar International Studium", UsageType.SPORTS));
        map.add(new Building("Bahir Dar International Airport", UsageType.GOVERNMENTAL));
        map.add(new Building("MuluAlem Cinema", UsageType.ENTERTAINMENT));
        map.add(new Building("Bahir Dar Gebeya Mall", UsageType.COMMERCIAL));

        map.add(new Utilities("Electricity", UtilityType.ELECTRICAL));
        map.add(new Utilities("Water", UtilityType.WATER));
        map.add(new Utilities("Gas", UtilityType.GAS));
        map.add(new Utilities("Pipe Line", UtilityType.PIPE_LINE));

        for(var m : map){
            Mappable.mapIt(m);
        }
    }
}
