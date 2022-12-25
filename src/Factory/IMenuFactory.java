package Factory;

import Menu.TeamMenu;
import Menu.CreateTournamentMenu;
import Menu.CreateUserMenu;

public interface IMenuFactory {

    void createMenu(String type);

}
