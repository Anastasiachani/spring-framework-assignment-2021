package gr.hua.dit.ds.dao;

import gr.hua.dit.ds.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class UserDAOImpl {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<User> getUsers() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<User> query = currentSession.createQuery("from User", User.class);


        // execute the query and get the results list
        List<User> users = query.getResultList();

        //return the results
        return users;
    }
}
