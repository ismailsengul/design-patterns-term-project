package Factory;

import Menu.TeamMenu;
import Menu.CreateTournamentMenu;
import Menu.CreateUserMenu;

public class MenuFactory implements IMenuFactory{


    @Override
    public void createMenu(String type) {

        switch (type) {
            case "1" ->  new CreateUserMenu(); //will be user menu
            case "2" -> new TeamMenu();
            case "3" -> new CreateTournamentMenu(); //will be tournament menu
            case "0" -> {
                System.out.println("Dream team app is closing...");
                System.exit(0);
            }

        };

    }
}
