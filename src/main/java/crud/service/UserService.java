
package crud.service;


import crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getUser(long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
