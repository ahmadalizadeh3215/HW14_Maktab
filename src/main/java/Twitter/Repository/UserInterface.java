package Twitter.Repository;

import Twitter.Model.User;

import java.util.List;

public interface UserInterface extends BaseRepository<User>{
List<User> findByUsername(String username);
List<User> searchByUsername(String username);
User login(String username,String password);
}
