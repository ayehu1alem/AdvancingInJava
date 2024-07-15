import java.util.LinkedList;
import java.util.List;
interface ISaveable {
    List<String> write();
    void read(List<String> data);
}

abstract class Printer implements ISaveable {
    String name;
    int hitPoints;
    int strength;

    public Printer(){}


    public List<String> write() {
        List<String> data = new LinkedList<>();
        data.add(name);
        data.add(Integer.toString(hitPoints));
        data.add(Integer.toString(strength));

        return data;
    }


    public void read(List<String> data, String name, int hitPoints, int strength) {
        this.name = data.get(0);
        this.hitPoints = Integer.parseInt(data.get(1));
        this.strength = Integer.parseInt(data.get(2));
        this.read(data, name, hitPoints, strength);
    }

    @Override
    public String toString() {
        return String.format("%s" +
                "name='%s', hitPoints=%d, strength=%s", getClass().getSimpleName(), name, hitPoints, strength);
    }
}



