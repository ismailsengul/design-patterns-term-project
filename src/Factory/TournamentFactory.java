package Factory;

import Demo.Application;
import Team.Team;
import Tournament.BasketballTournament;
import Tournament.FootballTournament;
import Tournament.VolleyballTournament;

import java.util.ArrayList;

public class TournamentFactory implements ITournamentFactory{


    @Override
    public FootballTournament createFootballTournament(String name, int size, ArrayList<Team> members) {
        FootballTournament footballTournament = new FootballTournament(name,"Football",size,members);
        Application.tournaments.add(footballTournament);
        return footballTournament;
    }

    @Override
    public BasketballTournament createBasketballTournament(String name, int size, ArrayList<Team> members) {
        BasketballTournament basketballTournament =  new BasketballTournament(name,"Basketball",size,members);
        Application.tournaments.add(basketballTournament);
        return basketballTournament;
    }

    @Override
    public VolleyballTournament createVolleyballTournament(String name, int size, ArrayList<Team> members) {
        VolleyballTournament volleyballTournament = new VolleyballTournament(name,"Volleyball",size,members);
        Application.tournaments.add(volleyballTournament);
        return volleyballTournament;

    }


}
