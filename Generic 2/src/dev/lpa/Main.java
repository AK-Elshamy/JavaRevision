package dev.lpa;

interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[]args){

        var philly = new Affiliation("city", "Cairo", "EG");

        Team<BaseballPlayer,Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        var p = new BaseballPlayer("bez","toA");
        phillies.addTeamMember(p);
        phillies.listTeamMembers();
        System.out.println("--------------------------");
        var messi = new FootballPlayer("Messi", "CF");

        var CR7 = new FootballPlayer("Ronaldo", "RLM");

        Team<FootballPlayer, Affiliation> Arsenal = new Team<>("Arsenal");
        Arsenal.addTeamMember(messi);
        Team<FootballPlayer, Affiliation> Liverpool = new Team<>("Liverpool");
        Liverpool.addTeamMember(CR7);

        scoreResult(Liverpool ,2, Arsenal, 1);
        Liverpool.addTeamMember(messi);

//         Liverpool.addTeamMember();
        Liverpool.listTeamMembers();
        System.out.println("----------------------------------");

        Team<VolleyballPlayer, Affiliation> unitedAFC = new Team<>("United AFC");
        unitedAFC.addTeamMember(new VolleyballPlayer("Rock", "Center"));
        unitedAFC.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> citAFC = new Team<>("City AFC");
        citAFC.addTeamMember(new VolleyballPlayer("Jack" , "Attack"));
        citAFC.listTeamMembers();
        scoreResult(citAFC, 45, unitedAFC,49);


    }
    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}