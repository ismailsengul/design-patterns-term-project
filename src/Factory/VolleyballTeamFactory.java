package Factory;

import Demo.Application;
import Team.Team;
import Team.VolleyballTeam;
import User.User;

import java.util.ArrayList;

public class VolleyballTeamFactory implements ITeamFactory{
    @Override
    public Team createTeam(String name, int size, ArrayList<User> members) {
        Team team = new VolleyballTeam(name,size,members);
        Application.teams.add(team);
        System.out.println("Team " + team + " created successfully");
        return team;
    }
}
