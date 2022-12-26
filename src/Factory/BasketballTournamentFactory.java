package Factory;

import Demo.Application;
import Team.Team;
import Tournament.Tournament;
import Tournament.BasketballTournament;

import java.util.ArrayList;

public class BasketballTournamentFactory implements ITournamentFactory{
    @Override
    public Tournament createTournament(String name, int size) {
        Tournament tournament = new BasketballTournament(name,size);
        Application.tournaments.add(tournament);
        System.out.println("Tournament " + tournament + " created successfully");
        return tournament;
    }
}
