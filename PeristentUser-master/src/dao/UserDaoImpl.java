/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mac
 */
public class UserDaoImpl implements IUserDao {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PeristentUserPU");
        em = emf.createEntityManager();
    }

    @Override
    public User findById(int id) {
        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("SELECT zoukou FROM User zoukou", User.class).getResultList();
    }

    @Override
    public boolean deleteById(int id) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if(user != null) {
            em.remove(user);
            em.getTransaction().commit();
            return true;
        }
        else {
            em.getTransaction().commit();
            return false;
        }
            
    }

    @Override
    public void updateById(int id, User user) {
       em.getTransaction().begin();
         User databaseUser = em.find(User.class, id);
        if(user != null) {
            databaseUser.setFirstName(user.getFirstName());
            databaseUser.setLastName(user.getLastName());
            databaseUser.setEmail(user.getEmail());
            databaseUser.setTel(user.getTel());
            
            em.getTransaction().commit();
            
        }
        else {
            em.getTransaction().commit();
            
        }
    }

    @Override
    public void save(User user) {
        em.getTransaction().begin();
         User InsertUser=new User();
        if(user != null) {
            em.persist(user);
            em.getTransaction().commit();
            
        }
        else {
            em.getTransaction().commit();
            
        }
    }
    
    
    
    
}
