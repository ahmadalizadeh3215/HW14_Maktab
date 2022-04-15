package Twitter.Service;

import Twitter.Model.Comment;
import Twitter.Model.User;
import Twitter.Repository.CommentRepository;
import Twitter.Repository.UserRepository;

public class CommentService extends BaseServiceImpl<Comment, CommentRepository>implements BaseService<Comment>{
    public CommentService(CommentRepository repo) {
        super(repo);
    }

}
