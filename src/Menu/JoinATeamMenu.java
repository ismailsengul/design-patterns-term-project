package Menu;

import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JoinATeamMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    public JoinATeamMenu(Scanner scanner, ArrayList<User> users, ArrayList<Team> teams, ArrayList<Tournament> tournaments) {

        this.scanner = scanner;
        this.users = users;
        this.teams = teams;
        this.tournaments = tournaments;

        System.out.println("Join a team");


        User pickedUser = userPicker(scanner,users);

        Team pickedTeam = teamPicker(scanner,teams);

        pickedTeam.addMember(pickedUser);

        teams.forEach(team -> {
            if (Objects.equals(team.getName(), pickedTeam.getName())) {
                team.setMembers(pickedTeam.getMembers());
            }
        });

        new MainMenu(scanner,users,teams,tournaments);
    }

    private Team teamPicker(Scanner scanner, ArrayList<Team> teams) {
        System.out.println("Please select a team");

        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i+1) + ") " + teams.get(i));
        }

        int choice = scanner.nextInt();
        while (choice > teams.size()) {
            System.out.println("Invalid choice. Please try again");
            choice = scanner.nextInt();
        }

        return teams.get(choice-1);
    }

    private User userPicker(Scanner scanner,ArrayList<User> users) {
        System.out.println("Please select a user");

        for (int i = 0; i < users.size(); i++) {
            System.out.println((i+1) + ") " + users.get(i));
        }

        int choice = scanner.nextInt();
        while (choice > users.size()) {
            System.out.println("Invalid choice. Please try again");
            choice = scanner.nextInt();
        }

        return users.get(choice-1);

    }
}
