package Factory;

import Team.Team;
import Tournament.BasketballTournament;
import Tournament.FootballTournament;
import Tournament.Tournament;
import Tournament.VolleyballTournament;
import User.User;

import java.util.ArrayList;

public interface ITournamentFactory {

    Tournament createTournament(String name, int size);
}
