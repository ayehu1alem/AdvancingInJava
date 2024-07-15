package generics;

interface Player {
    String name();
}
record BaseBallPlayer(String name, String position) implements Player {}
record FootBallPlayer(String name, String position) implements Player {}
record VolleyBalllPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
        var address = new Affiliation( "Ethiopia","Addis Ababa", "Tullu Dimto");
        Team<VolleyBalllPlayer, Affiliation> stGeorge = new Team<>("St. George", address);
        stGeorge.addTeamMember(new VolleyBalllPlayer("Tariku Mesfin", "Stricker"));
        stGeorge.addTeamMember(new VolleyBalllPlayer("Daniel Atinkut", "Mid-Fielder"));
        stGeorge.listTeamMembers();
        Team<VolleyBalllPlayer, String> fasilkenema = new Team<>("Fasil Kenema",  "Bahir Dar, Amhra Reginal State, Region- 03");
        fasilkenema.addTeamMember(new VolleyBalllPlayer("Alex haddis", "Mid-Fielder"));
        fasilkenema.addTeamMember(new VolleyBalllPlayer("Maru Atink", "Defender"));
        fasilkenema.listTeamMembers();


        storeResults(fasilkenema, 5, stGeorge, 2);
    }

    private static void storeResults(SportTeam team1, int score1, SportTeam team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s \n", team1, message, team2);
    }
    private static void storeResults(BaseBallTeam team1, int score1, BaseBallTeam team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s \n", team1, message, team2);
    }

    private static void storeResults(Team team1, int score1, Team team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s \n", team1, message, team2);
    }
}
