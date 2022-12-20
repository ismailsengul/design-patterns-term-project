package Menu;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUserMenu {

    String name;
    String email;
    int age;

    User user;

    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    public CreateUserMenu(Scanner scanner, ArrayList<User> users, ArrayList<Team> teams, ArrayList<Tournament> tournaments) {
        this.users = users;
        this.teams = teams;
        this.tournaments = tournaments;
        System.out.println("Create a new user");

        System.out.print("Name : ");
        this.name = scanner.next();

        System.out.print("Email : ");
        this.email = scanner.next();

        System.out.print("Age :");
        this.age = scanner.nextInt();

        this.user = new User(name,email,age);

        System.out.println("User " + user + " created successfully");

        users.add(user);
        new MainMenu(scanner,users,teams,tournaments);

    }
}
