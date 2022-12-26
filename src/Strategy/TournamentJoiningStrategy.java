/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Demo.Application;
import Menu.TeamMenu;
import Team.Team;
import Tournament.Tournament;

/**
 *
 * @author emrecinar
 */
public class TournamentJoiningStrategy implements IJoiningStrategy<Team, Tournament> {

    @Override
    public void join(Team team, Tournament tournament) {
        if (team.getType().equals(tournament.getType())) {
            tournament.addTeam(team);
            Application.tournaments.forEach(
                    tournament1 -> {
                        if (tournament1.getName().equals(tournament.getName())){
                            tournament1.setTeams(tournament.getTeams());
                        }
                    }
            );
        }
        else {
            System.out.println("Only " + tournament.getType() + " teams can join this tournament");
            new TeamMenu();
        }


    }
    
}
