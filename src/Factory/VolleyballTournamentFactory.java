package Factory;

import Demo.Application;
import Team.Team;
import Tournament.Tournament;
import Tournament.VolleyballTournament;

import java.util.ArrayList;

public class VolleyballTournamentFactory implements ITournamentFactory{
    @Override
    public Tournament createTournament(String name, int size) {
        Tournament tournament = new VolleyballTournament(name,size);
        Application.tournaments.add(tournament);
        return tournament;
    }
}
