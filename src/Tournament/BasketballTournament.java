package Tournament;

import Team.Team;

import java.util.ArrayList;

public class BasketballTournament extends Tournament{

    public BasketballTournament(String name,int size, ArrayList<Team> teams) {
        super(name, "Basketball", size, teams);
    }
}
