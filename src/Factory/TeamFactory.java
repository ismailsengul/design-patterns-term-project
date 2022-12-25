package Factory;

import Demo.Application;
import Team.BasketballTeam;
import Team.FootballTeam;
import Team.VolleyballTeam;
import User.User;

import java.util.ArrayList;

public class TeamFactory implements ITeamFactory{
    @Override
    public FootballTeam createFootballTeam(String name,int size, ArrayList<User> members) {
        FootballTeam footballTeam = new FootballTeam(name,"Football",size,members);
        Application.teams.add(footballTeam);
        System.out.println("Team " + footballTeam + " created successfully");
        return footballTeam;
    }

    @Override
    public BasketballTeam createBasketballTeam(String name,int size, ArrayList<User> members) {
        BasketballTeam basketballTeam =  new BasketballTeam(name, "Basketball", size, members);
        Application.teams.add(basketballTeam);
        System.out.println("Team " + basketballTeam + " created successfully");

        return basketballTeam;
    }

    @Override
    public VolleyballTeam createVolleyballTeam(String name,int size, ArrayList<User> members) {
        VolleyballTeam volleyballTeam =  new VolleyballTeam(name,"Volleyball",size, members);
        Application.teams.add(volleyballTeam);
        System.out.println("Team " + volleyballTeam + " created successfully");
        return volleyballTeam;
    }
}
