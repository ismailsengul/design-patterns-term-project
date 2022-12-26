package Team;

import User.User;

import java.util.ArrayList;

public class BasketballTeam extends Team{
    public BasketballTeam(String name,int size,ArrayList<User> members) {
        super(name,"Basketball",size,members);
    }
}
