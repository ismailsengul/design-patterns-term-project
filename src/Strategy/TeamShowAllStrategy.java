package Strategy;

import Demo.Application;
import Menu.TeamMenu;
import Menu.TournamentMenu;
import Team.Team;
import Tournament.Tournament;

public class TeamShowAllStrategy implements IShowAllStrategy{
    @Override
    public void showAll() {
        for (Team team: Application.teams) {
            System.out.println(team);
        }
        new TeamMenu();
    }
}
