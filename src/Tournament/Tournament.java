package Tournament;

import Team.Team;
import User.User;

import java.util.ArrayList;

public abstract class Tournament {

    String name;
    String type;
    int size;
    ArrayList<Team> teams;


    public Tournament(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.teams = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", teams=" + teams +
                '}';
    }

    public void addTeam(Team team) {
        if (team.getType().equals(this.type))
            this.teams.add(team);
    }

}
