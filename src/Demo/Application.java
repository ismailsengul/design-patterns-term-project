package Demo;

import Menu.MainMenu;
import Team.Team;
import Tournament.Tournament;
import User.User;
import Team.FootballTeam;
import Team.BasketballTeam;
import Tournament.BasketballTournament;
import Tournament.FootballTournament;
import Tournament.VolleyballTournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static ArrayList<User> users;
    public static ArrayList<Team> teams;
    public static ArrayList<Tournament> tournaments;
    public static Scanner scanner;

    public static void main(String[] args) {

        users = new ArrayList<>();
        teams = new ArrayList<>();
        tournaments = new ArrayList<>();
        scanner = new Scanner(System.in);

        User user1 = new User("İsmail","ismail@gmail.com",23);
        users.add(user1);

        User user2 = new User("Yunus Emre","yunus@gmail.com",22);
        users.add(user2);

        Team team1 = new FootballTeam("Fenerbahce",7);
        team1.addMember(user1);
        teams.add(team1);

        Team team2 = new BasketballTeam("Galatasaray",5);
        team2.addMember(user2);
        teams.add(team2);

        Tournament tournament1 = new FootballTournament("Dream Football",5);
        tournament1.addTeam(team1);
        tournaments.add(tournament1);

        Tournament tournament2 = new BasketballTournament("Dream Basketball",7);
        tournament2.addTeam(team2);
        tournaments.add(tournament2);

        Tournament tournament3 = new VolleyballTournament("Dream Volleyball",10);
        tournaments.add(tournament3);

        boolean run = true;
        new MainMenu();


        while (run) {
        }


    }
}
