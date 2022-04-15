package Twitter.Repository;

import Twitter.Model.Like;
import Twitter.Util.SessionFactorySingleton;
import org.hibernate.SessionFactory;

public class LikeRepository  extends BaseRepositoryImpl<Like>{
    public LikeRepository() {
        super();
    }
    public LikeRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
