package Twitter.Repository;

import Twitter.Model.Follow;
import org.hibernate.SessionFactory;

public class FollowRepository  extends BaseRepositoryImpl<Follow>{
    public FollowRepository() {
        super();
    }
    public FollowRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
