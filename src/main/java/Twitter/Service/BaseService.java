package Twitter.Service;

import Twitter.Model.Identity;


import java.util.List;

public interface BaseService<T extends Identity> {
    T save(T t);

    T findById(Integer id);

    List<T> findAll();

    T update(T t);

    void delete(T t);

}
