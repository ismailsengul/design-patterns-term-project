package Menu;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu {

    Scanner scanner;
    String choice;

    ArrayList<User> users;
    ArrayList<Team> teams;
    ArrayList<Tournament> tournaments = new ArrayList<>();



    public MainMenu(Scanner scanner,ArrayList<User> users,ArrayList<Team> teams,ArrayList<Tournament> tournaments){

        System.out.println("Welcome to the Dream Team App! \n" +
                "******************************* \n" +
                "1) Create a user \n" +
                "2) Create a team \n" +
                "3) Create a tournament \n" +
                "4) Join a team \n" +
                "5) Join a tournament \n" +
                "0) Exit");
        this.scanner = scanner;
        this.users = users;
        this.teams = teams;
        this.tournaments = tournaments;
        this.choice = scanner.next();
        changeMenu(choice);
    }

    public void changeMenu(String choice){
        switch (choice) {
            case "1" -> new CreateUserMenu(this.scanner,this.users,this.teams,this.tournaments);
            case "2" -> new CreateTeamMenu(this.scanner,this.users,this.teams,this.tournaments);
            case "3" -> new CreateTournamentMenu(this.scanner,this.users,this.teams,this.tournaments);
            case "4" -> new JoinATeamMenu(this.scanner, this.users, this.teams,this.tournaments);
            case "5" -> new JoinATournamentMenu(this.scanner, this.users, this.teams,this.tournaments);
            case "0" -> {
                System.out.println("Dream team app is closing...");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid choice. Please try again...");
                choice = this.scanner.next();
            }
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }
}
