package Factory;

import Team.BasketballTeam;
import Team.FootballTeam;
import Team.VolleyballTeam;
import User.User;

import java.util.ArrayList;

public interface ITeamFactory {

    FootballTeam createFootballTeam(String name,int size, ArrayList<User> members);
    BasketballTeam createBasketballTeam(String name,int size, ArrayList<User> members);
    VolleyballTeam createVolleyballTeam(String name,int size, ArrayList<User> members);
}
