import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Monster extends Printer implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    @Override
    public void read(List<String> data) {
        data = super.write();
    }

    @Override
    public List<String> write() {
        return super.write();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


}
