package generics;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {
    private String name;
    private List<BaseBallPlayer> teamMember = new ArrayList<>();
    private int totalLoss = 0;
    private int totalWins = 0;
    private int totalTies = 0;

    public BaseBallTeam(String name) {
        this.name = name;
    }

    public void addTeamMember(BaseBallPlayer player){
        if(!teamMember.contains(player)){
            teamMember.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(name + " Roster: ");
        System.out.println(teamMember);
    }

    public int ranking(){
        return (totalLoss * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String msg = " lost to ";
        if(ourScore > theirScore){
            totalWins++;
            msg = " beat ";
        }
        else if(ourScore == theirScore){
            totalTies++;
            msg = " ties ";
        }
        else {
            totalLoss++;
        }

        return msg;
    }

    @Override
    public String toString() {
        return name + " (Ranked: " + ranking() + ")";
    }
}
