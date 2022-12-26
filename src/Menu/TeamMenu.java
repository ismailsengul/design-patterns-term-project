package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Strategy.IShowAllStrategy;
import Strategy.TeamShowAllStrategy;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamMenu {

    Scanner scanner;

    String name;
    String type;
    int size;
    ArrayList<User> members;
    IObjectFactory objectFactory;
    IShowAllStrategy showAllStrategy;

    public TeamMenu(){

        this.scanner = Application.scanner;
        this.members = new ArrayList<>();
        this.objectFactory = new ObjectFactory();
        this.showAllStrategy = new TeamShowAllStrategy();

        showMenu();


    }

    public void showMenu(){

        System.out.println("1) Create Team");
        System.out.println("2) Show Teams");
        System.out.println("3) Join a Tournament");
        System.out.println("0) Go Back");

        switch (scanner.next()) {
            case "1" -> createTeam();
            case "2" -> showAllStrategy.showAll();
            case "3" -> joinATournament();
            case "0" -> new MainMenu();
            default -> {
                System.out.println("Invalid choice.");
                new TeamMenu();
            }
        }
    }

    public void joinATournament() {
        new JoinATournamentMenu();
    }

    public void createTeam(){
        System.out.println("Create a new team");

        System.out.println("1) Football Team");
        System.out.println("2) Basketball Team");
        System.out.println("3) Volleyball Team");

        this.type = scanner.next();

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Size : ");
        this.size = scanner.nextInt();

        objectFactory.createTeam(type,name,size);
        new TeamMenu();
    }
}
