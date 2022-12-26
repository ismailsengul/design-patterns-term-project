/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Team.Team;
import Tournament.Tournament;

/**
 *
 * @author emrecinar
 */
public class TournamentJoiningStrategy implements IJoiningStrategy<Team, Tournament> {

    @Override
    public void join(Team team, Tournament tournament) {
        tournament.addTeam(team);
        System.out.println("Tournament Strategy is using...");
    }
    
}
