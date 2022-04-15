package Twitter.Service;

import Twitter.Model.Follow;
import Twitter.Model.User;
import Twitter.Repository.FollowRepository;
import Twitter.Repository.UserRepository;

public class FollowService extends BaseServiceImpl<Follow, FollowRepository>implements BaseService<Follow>{
    public FollowService(FollowRepository repo) {
        super(repo);
    }
}
