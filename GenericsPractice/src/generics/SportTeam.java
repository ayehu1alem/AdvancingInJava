package generics;


import java.util.ArrayList;
import java.util.List;

public class SportTeam {
    private String name;
    private List<FootBallPlayer> teamMember = new ArrayList<>();
    private int totalLoss = 0;
    private int totalWins = 0;
    private int totalTies = 0;

    public SportTeam(String name) {
        this.name = name;
    }

    public void addTeamMember(FootBallPlayer t){
        if(!teamMember.contains(t)){
            teamMember.add(t);
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
