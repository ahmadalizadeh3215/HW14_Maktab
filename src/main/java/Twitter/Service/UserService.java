package Twitter.Service;

import Twitter.Model.User;
import Twitter.Repository.UserRepository;

import java.util.List;

public class UserService extends BaseServiceImpl<User, UserRepository>implements BaseService<User>{
    public UserService(UserRepository repo) {
        super(repo);
    }
    public List<User> findByUsername(String username){
        return repo.findByUsername(username);
    }
    public List<User> searchByUsername(String username){
        return repo.searchByUsername(username);
    }
    public User login(String username, String password){return repo.login(username,password);}


}
