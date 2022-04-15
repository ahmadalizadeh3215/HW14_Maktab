package Twitter.Repository;

import Twitter.Model.Tweet;
import org.hibernate.SessionFactory;

public class TweetRepository  extends BaseRepositoryImpl<Tweet>{
    public TweetRepository() {
        super();
    }
    public TweetRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
