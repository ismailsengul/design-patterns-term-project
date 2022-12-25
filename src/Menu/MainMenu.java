package Menu;

import Demo.Application;
import Factory.IMenuFactory;
import Factory.MenuFactory;
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

    IMenuFactory menuFactory;



    public MainMenu(){

        menuFactory = new MenuFactory();

        System.out.println("Welcome to the Dream Team App! \n" +
                "******************************* \n" +
                "1) User Menu \n" +
                "2) Team Menu \n" +
                "3) Tournament Menu \n" +
                "0) Exit");
        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.choice = scanner.next();
        changeMenu(choice);
    }

    public void changeMenu(String choice){
       if (choice.equals("0") || choice.equals("1")||choice.equals("2") || choice.equals("3")){
           menuFactory.createMenu(choice);
       }else {
           System.out.println("Invalid choice. Please try again...");
           choice = this.scanner.next();
           changeMenu(choice);
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
