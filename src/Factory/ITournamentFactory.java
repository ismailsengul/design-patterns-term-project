package Factory;

import Team.Team;
import Tournament.BasketballTournament;
import Tournament.FootballTournament;
import Tournament.VolleyballTournament;
import User.User;

import java.util.ArrayList;

public interface ITournamentFactory {

    FootballTournament createFootballTournament(String name,int size, ArrayList<Team> members);
    BasketballTournament createBasketballTournament(String name,int size, ArrayList<Team> members);
    VolleyballTournament createVolleyballTournament(String name,int size, ArrayList<Team> members);
}
