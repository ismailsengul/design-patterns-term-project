package Strategy;

import Demo.Application;
import Menu.TournamentMenu;
import Menu.UserMenu;
import Tournament.Tournament;
import User.User;

public class UserShowAllStrategy implements IShowAllStrategy{
    @Override
    public void showAll() {
        for (User user: Application.users) {
            System.out.println(user);
        }
        new UserMenu();
    }
}
