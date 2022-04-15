package Twitter.Repository;

import Twitter.Model.Identity;
import Twitter.Util.SessionFactorySingleton;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class BaseRepositoryImpl <T extends Identity> implements BaseRepository<T> {
    protected SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public BaseRepositoryImpl() {
    }

    public BaseRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T save(T t) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.save(t);
                transaction.commit();
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return null;
            }
        }

    }

    @Override
    public T update(T t) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.update(t);
                transaction.commit();
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                throw e;
            }
        }


    }

    @Override
    public void delete(T t) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.delete(t);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
            }
        }


    }

    @Override
    public T findById(Class<T> tClass, Integer id) {
        try (var session = sessionFactory.openSession()) {
            return session.get(tClass, id);
        }


    }

    @Override
    public List<T> findAll(Class<T> tClass) {
        try (var session = sessionFactory.openSession()) {
            Criteria criteria = session.createCriteria(tClass);
            return criteria.list();
        }
    }
}
