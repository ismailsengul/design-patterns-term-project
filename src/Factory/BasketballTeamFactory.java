package Factory;

import Demo.Application;
import Team.Team;
import Team.BasketballTeam;
import User.User;

import java.util.ArrayList;

public class BasketballTeamFactory implements ITeamFactory{
    @Override
    public Team createTeam(String name, int size, ArrayList<User> members) {
        Team team = new BasketballTeam(name,size,members);
        Application.teams.add(team);
        System.out.println("Team " + team + " created successfully");
        return team;
    }
}
