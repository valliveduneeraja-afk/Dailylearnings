class Voting {
    String name;
    int division;
    String pollingbooth;
}
public class VotingDetails {
    public static void main (String[] args) {
        Voting v1 = new Voting();
        v1.name = "Girija";
        v1.division = 31;
        v1.pollingbooth = "Kannan schl";
        Voting v2 = new Voting();
        v2.name = "Manyam";
        v2.division = 35 ;
        v2.pollingbooth = "Kings schl";
        Voting v3 = new Voting();
        v3.name = "Hari";
        v3.division = 40;
        v3.pollingbooth = "Camford schl";
        System.out.println(v1.name);
        System.out.println(v1.division);
        System.out.println(v1.pollingbooth);
        System.out.println(v2.name);
        System.out.println(v2.division);
        System.out.println(v2.pollingbooth);
        System.out.println(v3.name);
        System.out.println(v3.division);
        System.out.println(v3.pollingbooth);
    }
}
