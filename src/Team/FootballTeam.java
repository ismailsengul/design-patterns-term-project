package Team;

import User.User;

import java.util.ArrayList;

public class FootballTeam extends Team{
    public FootballTeam(String name,int size,ArrayList<User> members) {
        super(name,"Football",size,members);
    }
}
