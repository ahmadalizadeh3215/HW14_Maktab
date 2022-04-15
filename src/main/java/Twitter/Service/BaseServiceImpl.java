package Twitter.Service;

import Twitter.Model.Identity;
import Twitter.Repository.BaseRepository;

import java.util.List;


public abstract class BaseServiceImpl<T extends Identity,R extends BaseRepository<T>>
        implements BaseService<T> {
    R repo;
    private Class<T> tClass;
    public BaseServiceImpl(R repo) {this.repo = repo;}

    @Override
    public T save(T t) {
        return repo.save(t);

    }

    @Override
    public T findById(Integer id) {
        return repo.findById(tClass,id);
    }

    @Override
    public List<T> findAll() {
        return repo.findAll(tClass);
    }

    @Override
    public T update(T t) {
        return repo.update(t);
    }

    @Override
    public void delete(T t) {
        repo.delete(t);

    }
}
