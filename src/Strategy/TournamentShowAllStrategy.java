package Strategy;

import Demo.Application;
import Menu.TournamentMenu;
import Tournament.Tournament;

import java.util.ArrayList;

public class TournamentShowAllStrategy implements IShowAllStrategy {
    @Override
    public void showAll() {
        for (Tournament tournament: Application.tournaments) {
            System.out.println(tournament);
        }
        new TournamentMenu();
    }
}
