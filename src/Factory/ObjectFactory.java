package Factory;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;

public class ObjectFactory implements IObjectFactory {

    IUserFactory userFactory = new UserFactory();
    ITeamFactory teamFactory = new TeamFactory();
    ITournamentFactory tournamentFactory = new TournamentFactory();
    @Override
    public User createUser(String name, String email, int age) {
        return userFactory.createUser(name,email,age);
    }

    @Override
    public Team createTeam(String type,String name,int size, ArrayList<User> members) {
        Team team;
        switch (type) {
            case "1" -> team = teamFactory.createFootballTeam(name,size,members);
            case "2" -> team = teamFactory.createBasketballTeam(name,size,members);
            case "3" -> team = teamFactory.createVolleyballTeam(name,size,members);
            default -> team = null;
        }
        return team;
    }

    @Override
    public Tournament createTournament(String type,String name,int size, ArrayList<Team> members) {
        Tournament tournament;
        switch (type) {
            case "1" -> tournament = tournamentFactory.createFootballTournament(name,size,members);
            case "2" -> tournament = tournamentFactory.createBasketballTournament(name,size,members);
            case "3" -> tournament = tournamentFactory.createVolleyballTournament(name,size,members);
            default -> tournament = null;
        }
        return tournament;
    }
}
