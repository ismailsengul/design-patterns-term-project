package Menu;

import Team.BasketballTeam;
import Team.FootballTeam;
import Team.Team;
import Team.VolleyballTeam;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateTeamMenu {

    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    String name;
    String type;
    int size;
    ArrayList<User> members = new ArrayList<>();

    Team team;

    public CreateTeamMenu(Scanner scanner,ArrayList<User> users,ArrayList<Team> teams,ArrayList<Tournament> tournaments){
        this.users = users;
        this.teams = teams;
        this.tournaments = tournaments;

        System.out.println("Create a new team");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Type : ");
        this.type = scanner.next();

        System.out.print("Size :");
        this.size = scanner.nextInt();

        switch (type.toLowerCase().trim()) {

            case "football" : team = new FootballTeam(name,type,size,members);
            break;

            case "basketball" : team = new BasketballTeam(name,type,size,members);
            break;

            case "volleyball" : team = new VolleyballTeam(name,type,size,members);

            default: System.out.println("Invalid team type. Please try again");
            break;
        }

        System.out.println("Team " + team + " created successfully");

        teams.add(team);

        new MainMenu(scanner,users,teams,tournaments);
    }
}
