import Menu.MainMenu;
import Team.Team;
import Tournament.Tournament;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Tournament> tournaments = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        MainMenu mainMenu = new MainMenu(scanner,users,teams,tournaments);

        mainMenu.setTournaments(tournaments);
        while (run) {
        }


    }
}
