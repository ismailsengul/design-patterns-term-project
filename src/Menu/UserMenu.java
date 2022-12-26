package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;
    ArrayList<Tournament> tournaments;
    String name;
    String email;
    int age;
    IObjectFactory objectFactory;

    public UserMenu(){

        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        this.objectFactory = new ObjectFactory();

        showMenu();


    }

    public void showMenu(){

        System.out.println("1) Create a User");
        System.out.println("2) Show Users");
        System.out.println("3) Join a Team");
        System.out.println("0) Go Back");

        switch (scanner.next()) {
            case "1" -> createUser();
            case "2" -> showUsers();
            case "3" -> joinATeam();
            case "0" -> new MainMenu();
            default -> {
                System.out.println("Invalid choice.");
                new UserMenu();
            }
        }
    }

    public void joinATeam() {
        new JoinATeamMenu();
    }

    public void createUser(){
        System.out.println("Create a new user");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Email :");
        this.email = scanner.next();

        System.out.print("Age :");
        this.age = scanner.nextInt();

        objectFactory.createUser(name,email,age);

        new UserMenu();
    }

    public void showUsers(){
        for (User user: users) {
            System.out.println(user);
        }
        new UserMenu();
    }
}
