package Menu;

import Demo.Application;
import Strategy.IJoiningStrategy;
import Strategy.TournamentJoiningStrategy;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JoinATournamentMenu {

    Scanner scanner;
    ArrayList<User> users;
    ArrayList<Team> teams;

    ArrayList<Tournament> tournaments;
    public JoinATournamentMenu() {
        System.out.println("Join a tournament");
        this.scanner = Application.scanner;
        this.users = Application.users;
        this.teams = Application.teams;
        this.tournaments = Application.tournaments;
        IJoiningStrategy strategy = new TournamentJoiningStrategy();

        Team pickedTeam = teamPicker(scanner,teams);
        Tournament pickedTournament = tournamentPicker(scanner,tournaments);

        strategy.join(pickedTeam, pickedTournament);

        tournaments.forEach(tournament -> {
            if (Objects.equals(tournament.getName(), pickedTournament.getName())) {
                tournament.setTeams(pickedTournament.getTeams());
            }
        });

        new MainMenu();
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

    private Tournament tournamentPicker(Scanner scanner,ArrayList<Tournament> tournaments) {
        System.out.println("Please select a tournament");

        for (int i = 0; i < tournaments.size(); i++) {
            System.out.println((i+1) + ") " + tournaments.get(i));
        }

        int choice = scanner.nextInt();
        while (choice > tournaments.size()) {
            System.out.println("Invalid choice. Please try again");
            choice = scanner.nextInt();
        }

        return tournaments.get(choice-1);

    }
}
