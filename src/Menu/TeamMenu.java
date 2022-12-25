package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    String name;
    String type;
    int size;
    ArrayList<User> members;
    IObjectFactory objectFactory;

    public TeamMenu(){

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.members = new ArrayList<>();
        this.objectFactory = new ObjectFactory();

        showMenu();


    }

    public void showMenu(){

        System.out.println("1) Create Team");
        System.out.println("2) Show Teams");
        System.out.println("3) Join a Tournament");
        System.out.println("0) Go Back");

        switch (scanner.next()) {
            case "1" -> createTeam();
            case "2" -> showTeams();
            case "3" -> joinATournament();
            case "0" -> new MainMenu();
        }
    }

    public JoinATournamentMenu joinATournament() {
        return new JoinATournamentMenu();
    }

    public void createTeam(){
        System.out.println("Create a new team");

        System.out.println("1) Football Team");
        System.out.println("2) Basketball Team");
        System.out.println("3) Volleyball Team");

        this.type = scanner.next();

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Size :");
        this.size = scanner.nextInt();

        objectFactory.createTeam(type,name,size,members);
    }

    public void showTeams(){
        for (Team team: teams) {
            System.out.println(team);
        }
    }
}
