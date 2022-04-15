package Twitter.Repository;

import Twitter.Model.Identity;

import java.util.List;

public interface BaseRepository<T extends Identity> {
    T save(T t);
    T update(T t);
    void delete(T t);
    T findById(Class<T> tClass , Integer id);
    List<T> findAll(Class<T> tClass);
}
