/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

public interface IUser {

    User findById(int id);
    
    List<User> findAll();
    
    boolean deleteById(int id);
    
    void save(User user);
    
    void update(int id, User user);
}
