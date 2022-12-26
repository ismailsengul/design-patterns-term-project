package Factory;

import Demo.Application;
import User.User;

public class UserFactory implements IUserFactory{
    @Override
    public User createUser(String name, String email, int age) {
        User user = new User(name,email,age);
        Application.users.add(user);
        return user;
    }
}
