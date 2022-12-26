package Factory;

import Team.BasketballTeam;
import Team.FootballTeam;
import Team.Team;
import Team.VolleyballTeam;
import User.User;

import java.util.ArrayList;

public interface ITeamFactory {

    Team createTeam(String name, int size, ArrayList<User> members);
}
