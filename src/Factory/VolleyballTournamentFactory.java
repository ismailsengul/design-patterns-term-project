package Factory;

import Demo.Application;
import Team.Team;
import Tournament.Tournament;
import Tournament.VolleyballTournament;

import java.util.ArrayList;

public class VolleyballTournamentFactory implements ITournamentFactory{
    @Override
    public Tournament createTournament(String name, int size, ArrayList<Team> members) {
        Tournament tournament = new VolleyballTournament(name,size,members);
        Application.tournaments.add(tournament);
        return tournament;
    }
}
