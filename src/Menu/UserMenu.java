package Menu;

import Demo.Application;
import Factory.IObjectFactory;
import Factory.ObjectFactory;
import Strategy.IShowAllStrategy;
import Strategy.UserShowAllStrategy;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {

    Scanner scanner;
    String name;
    String email;
    int age;
    IObjectFactory objectFactory;
    IShowAllStrategy showAllStrategy;

    public UserMenu(){

        this.scanner = Application.scanner;
        this.objectFactory = new ObjectFactory();
        this.showAllStrategy = new UserShowAllStrategy();

        showMenu();


    }

    public void showMenu(){

        System.out.println("1) Create a User");
        System.out.println("2) Show Users");
        System.out.println("3) Join a Team");
        System.out.println("0) Go Back");

        switch (scanner.next()) {
            case "1" -> createUser();
            case "2" -> showAllStrategy.showAll();
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

        System.out.print("Email : ");
        this.email = scanner.next();

        System.out.print("Age : ");
        this.age = scanner.nextInt();

        objectFactory.createUser(name,email,age);

        new UserMenu();
    }

}
