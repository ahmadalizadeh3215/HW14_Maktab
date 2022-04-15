package Twitter.Service;

import Twitter.Model.Like;
import Twitter.Model.User;
import Twitter.Repository.LikeRepository;
import Twitter.Repository.UserRepository;

public class LikeService extends BaseServiceImpl<Like, LikeRepository>implements BaseService<Like>{
    public LikeService(LikeRepository repo) {
        super(repo);
    }
}
