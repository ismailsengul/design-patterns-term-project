package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TournamentMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    String name;
    String type;
    int size;
    ArrayList<Team> members;
    IObjectFactory objectFactory;

    public TournamentMenu(){

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.members = new ArrayList<>();
        this.objectFactory = new ObjectFactory();

        showMenu();


    }

    public void showMenu(){

        System.out.println("1) Create Tournament");
        System.out.println("2) Show Tournaments");
        System.out.println("0) Go Back");

        switch (scanner.next()) {
            case "1" -> createTournament();
            case "2" -> showTournaments();
            case "0" -> new MainMenu();
            default -> {
                System.out.println("Invalid choice.");
                new TournamentMenu();
            }
        }
    }

    public void createTournament(){
        System.out.println("Create a new tournament");

        System.out.println("1) Football Tournament");
        System.out.println("2) Basketball Tournament");
        System.out.println("3) Volleyball Tournament");

        this.type = scanner.next();

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Size :");
        this.size = scanner.nextInt();

        objectFactory.createTournament(type,name,size,members);
        new TournamentMenu();
    }

    public void showTournaments(){
        for (Tournament tournament: tournaments) {
            System.out.println(tournament);
        }
        new TournamentMenu();
    }
}
