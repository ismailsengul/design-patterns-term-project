package Factory;

import Menu.TeamMenu;
import Menu.TournamentMenu;
import Menu.UserMenu;

public class MenuFactory implements IMenuFactory{


    @Override
    public void createMenu(String type) {

        switch (type) {
            case "1" ->  new UserMenu();
            case "2" -> new TeamMenu();
            case "3" -> new TournamentMenu(); //will be tournament menu
            case "0" -> {
                System.out.println("Dream team app is closing...");
                System.exit(0);
            }

        }

    }
}
