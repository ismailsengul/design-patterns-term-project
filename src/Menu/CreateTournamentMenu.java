package Menu;

import Demo.Application;
import Team.Team;
import Tournament.FootballTournament;
import Tournament.BasketballTournament;
import Tournament.VolleyballTournament;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateTournamentMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;

    String name;
    String type;
    int size;

    ArrayList<Team> members;
    Tournament tournament;

    public CreateTournamentMenu(){

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.members = new ArrayList<>();


        System.out.println("Create a new tournament");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.println("Type : " );
        this.type = scanner.next();

        System.out.println("Size : ");
        this.size = scanner.nextInt();

        switch (type.toLowerCase().trim()) {

            case "football" : tournament = new FootballTournament(name,type,size,members);
                break;

            case "basketball" : tournament = new BasketballTournament(name,type,size,members);
                break;

            case "volleyball" : tournament = new VolleyballTournament(name,type,size,members);
                break;

            default: System.out.println("Invalid tournament type. Please try again");
                break;
        }

        if ( tournament != null) {
            System.out.println("Tournament " + tournament + " created successfully");
            tournaments.add(tournament);
        }


        new MainMenu();
    }
}
