package Factory;

import Menu.TeamMenu;
import Menu.CreateTournamentMenu;
import Menu.CreateUserMenu;

public interface IMenuFactory {

    CreateUserMenu createUserMenu();
    TeamMenu createTeamMenu();

    CreateTournamentMenu createTournamentMenu();

}
