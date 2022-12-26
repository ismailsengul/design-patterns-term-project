/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Team.Team;
import User.User;


/**
 *
 * @author emrecinar
 */
public class UserJoiningStrategy implements IJoiningStrategy<User, Team> {

    @Override
    public void join(User user, Team team) {
        team.addMember(user);
        System.out.println("User Strategy is using...");
    }
    
}
