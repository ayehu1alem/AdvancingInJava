import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Expected Output
                 //Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
                 //Monster{name='Werewolf', hitPoints=20, strength=40}

//        Player p1 = new Player("Tim", 10, 15);
//        //Monster m = new Monster("Werewolf", 20, 40);
//
//        p1.write();
//        p1.toString();
//        System.out.println(p1);
//        //m.write();
        Printer p =new Player("Tim", 10, 15);


        var players = new LinkedList<Printer>();
        players.add(new Player("Tim", 10, 15));
        System.out.println(players);
        players.add(new Monster("Werewolf", 20, 40));
        System.out.println(players);

    }


}
