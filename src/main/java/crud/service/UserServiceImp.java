package crud.service;

import crud.dao.UserDao;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public List<User> getAll() {
      return userDao.getAll();
   }

   @Override
   public User getUser(long id) {
      return userDao.getUser(id);
   }

   @Transactional
   @Override
   public void createUser(User user) {
      userDao.createUser(user);
   }

   @Transactional
   @Override
   public void updateUser(User user) {
      userDao.updateUser(user);
   }

   @Transactional
   @Override
   public void deleteUser(long id) {
      userDao.deleteUser(id);
   }
}
