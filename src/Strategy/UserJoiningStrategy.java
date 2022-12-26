/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Demo.Application;
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
        Application.teams.forEach(team1 -> {
            if (team1.getName().equals(team.getName())){
                team1.setMembers(team.getMembers());
            }
        });
    }
    
}
