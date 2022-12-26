package Tournament;

import Team.Team;

import java.util.ArrayList;

public class VolleyballTournament extends Tournament{

    public VolleyballTournament(String name,int size, ArrayList<Team> teams) {
        super(name, "Volleyball",size, teams);
    }
}
