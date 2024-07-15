package generics;


import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}

public class Team <T extends Player, S> {
    private String teamName;
    private List<T> teamMember = new ArrayList<>();
    private int totalLoss = 0;
    private int totalWins = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String name) {
        this.teamName = name;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t){
        if(!teamMember.contains(t)){
            teamMember.add(t);
        }
    }

    public void listTeamMembers(){
        System.out.print(teamName + ", Ethiopian Premier League");
        System.out.println(affiliation == null ? "" : " Affiliation: " + affiliation);
        for(T t : teamMember){
            System.out.println(t.name());
        }
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
        return teamName + " (Ranked: " + ranking() + ")";
    }
}
