package Factory;

import Menu.TeamMenu;
import Menu.CreateTournamentMenu;
import Menu.CreateUserMenu;

public class MenuFactory implements IMenuFactory{

    @Override
    public CreateUserMenu createUserMenu() {
        return new CreateUserMenu();
    }

    @Override
    public TeamMenu createTeamMenu() {
        return new TeamMenu();
    }

    @Override
    public CreateTournamentMenu createTournamentMenu() {
        return new CreateTournamentMenu();
    }
}
