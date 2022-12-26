package Factory;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;

public class ObjectFactory implements IObjectFactory {

    IUserFactory userFactory = new UserFactory();
    ITeamFactory teamFactory;
    ITournamentFactory tournamentFactory;
    @Override
    public User createUser(String name, String email, int age) {
        return userFactory.createUser(name,email,age);
    }

    @Override
    public Team createTeam(String type,String name,int size, ArrayList<User> members) {
        Team team;
        switch (type) {
            case "1" -> teamFactory = new FootballTeamFactory();
            case "2" -> teamFactory = new BasketballTeamFactory();
            case "3" -> teamFactory = new VolleyballTeamFactory();
            default -> {
                System.out.println("Invalid choice.");
                new ObjectFactory();
            }
        }

        team = teamFactory.createTeam(name,size,members);
        return team;
    }

    @Override
    public Tournament createTournament(String type,String name,int size, ArrayList<Team> members) {
        Tournament tournament;
        switch (type) {
            case "1" -> tournamentFactory = new FootballTournamentFactory();
            case "2" -> tournamentFactory = new BasketballTournamentFactory();
            case "3" -> tournamentFactory = new VolleyballTournamentFactory();
            default -> {
                System.out.println("Invalid choice.");
                 new ObjectFactory();
            }
        }

        tournament = tournamentFactory.createTournament(name,size,members);
        return tournament;
    }
}
