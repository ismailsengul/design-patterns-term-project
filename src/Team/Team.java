package Team;

import User.User;

import java.util.ArrayList;

public abstract class Team {

    String name;
    String type;
    int size;

    ArrayList<User> members;



    public Team(String name, String type, int size){
        this.name = name;
        this.type = type;
        this.size = size;
        this.members = new ArrayList<>();
    }

    public void printMembers(){
        for (User user : members) {
            System.out.println(user.toString());
        }
    }
    public void addMember(User user) {

        this.members.add(user);

    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", members=" + members +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void notify(User user, String name) {
        user.update(name);
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

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }


}
