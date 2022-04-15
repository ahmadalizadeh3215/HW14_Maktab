package Twitter.Repository;

import Twitter.Model.User;
import org.hibernate.SessionFactory;


import java.util.List;

public class UserRepository  extends BaseRepositoryImpl<User>implements UserInterface{
    public UserRepository() {
        super();
    }
    public UserRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    @Override
    public List<User> findByUsername(String username) {
        try (var session = sessionFactory.openSession()){
            String hql="FROM User u where u.username = :username";
            var query=session.createQuery(hql,User.class);
            query.setParameter("username",username);
            return query.getResultList();
        }
    }

    @Override
    public List<User> searchByUsername(String username) {
        try (var session = sessionFactory.openSession()){
            String hql="FROM User u where u.username like :username";
            var query=session.createQuery(hql,User.class);
            query.setParameter("%"+"username"+"%",username);
            return query.getResultList();
        }
    }

    @Override
    public User login(String username, String password) {
        try (var session=sessionFactory.openSession()){
            var query=session.createQuery("from User u where" +
                    " u.username = :username and u.password = :password ",User.class);
            query.setParameter("username",username);
            query.setParameter("password",password);
            return query.getSingleResult();

        }
    }
}
