package Factory;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;

public interface IObjectFactory {

    User createUser(String name, String email, int age);

    Team createTeam(String type,String name,int size);
    Tournament createTournament(String type,String name,int size, ArrayList<Team> members);
}
