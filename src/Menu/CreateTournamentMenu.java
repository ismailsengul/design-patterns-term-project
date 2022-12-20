package Menu;

import Team.Team;
import Tournament.FootballTournament;
import Tournament.BasketballTournament;
import Tournament.VolleyballTournament;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateTournamentMenu {

    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;

    String name;
    String type;
    int size;

    Tournament tournament;

    public CreateTournamentMenu(Scanner scanner, ArrayList<User> users,ArrayList<Team> teams,ArrayList<Tournament> tournaments){
        this.users = users;
        this.teams = teams;
        this.tournaments = tournaments;

        System.out.println("Create a new tournament");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.println("Type : " );
        this.type = scanner.next();

        System.out.println("Size : ");
        this.size = scanner.nextInt();

        switch (type.toLowerCase().trim()) {

            case "football" : tournament = new FootballTournament(name,type,size,teams);
                break;

            case "basketball" : tournament = new BasketballTournament(name,type,size,teams);
                break;

            case "volleyball" : tournament = new VolleyballTournament(name,type,size,teams);

            default: System.out.println("Invalid tournament type. Please try again");
                break;
        }

        System.out.println("Tournament " + tournament + " created successfully");

        tournaments.add(tournament);


        new MainMenu(scanner,users,teams,tournaments);
    }
}
