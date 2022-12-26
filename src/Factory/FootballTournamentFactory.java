package Factory;

import Demo.Application;
import Team.Team;
import Tournament.Tournament;
import Tournament.FootballTournament;

import java.util.ArrayList;

public class FootballTournamentFactory implements ITournamentFactory{
    @Override
    public Tournament createTournament(String name, int size) {
        Tournament tournament = new FootballTournament(name,size);
        Application.tournaments.add(tournament);
        System.out.println("Tournament " + tournament + " created successfully");
        return tournament;
    }
}
