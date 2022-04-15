package Twitter.Service;

import Twitter.Model.Tweet;
import Twitter.Model.User;
import Twitter.Repository.TweetRepository;
import Twitter.Repository.UserRepository;

public class TweetService extends BaseServiceImpl<Tweet, TweetRepository>implements BaseService<Tweet>{
    public TweetService(TweetRepository repo) {
        super(repo);
    }
}
