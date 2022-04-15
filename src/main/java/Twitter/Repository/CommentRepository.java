package Twitter.Repository;

import Twitter.Model.Comment;
import org.hibernate.SessionFactory;

public class CommentRepository extends BaseRepositoryImpl<Comment>{
    public CommentRepository() {
        super();
    }
    public CommentRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
