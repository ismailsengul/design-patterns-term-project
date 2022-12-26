package Factory;

import User.User;

public interface IUserFactory {

    User createUser(String name, String email, int age);
}
