/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

public class UserImpl implements IUser{
    
    private dao.UserDaoImpl userDao;
            
    //business logic
    @Override
    public User findById(int id) {
        if(id <= 0) {
            return null;
        } else {
            userDao = new dao.UserDaoImpl();
            return userDao.findById(id);
        }
    }

    @Override
    public List<User> findAll() {        
        userDao = new dao.UserDaoImpl();
        return userDao.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        userDao = new dao.UserDaoImpl();
        if(id <= 0) {
            return false;
        } else {
        return userDao.deleteById(id);
        }
    }

    @Override
    public void save(User user) {
        userDao = new dao.UserDaoImpl();
        userDao.save(user);
    }

    @Override
    public void update(int id, User user) {
        userDao = new dao.UserDaoImpl();
        userDao.updateById(id, user);
    }
}
