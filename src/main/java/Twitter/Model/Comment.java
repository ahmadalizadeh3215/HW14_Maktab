package Twitter.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment extends Identity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "tweet_id")
    private Tweet tweet;
    @Column(nullable = false, columnDefinition = "varchar(280)")
    private String description;
    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment reply;

    public Comment(Integer id, User user, Tweet tweet, String description, Comment reply) {
        super(id);
        this.user = user;
        this.tweet = tweet;
        this.description = description;
        this.reply = reply;
    }

    public Comment(User user, Tweet tweet, String description, Comment reply) {
        this.user = user;
        this.tweet = tweet;
        this.description = description;
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user=" + user +
                ", tweet=" + tweet +
                ", description='" + description + '\'' +
                ", reply=" + reply +
                "} " + super.toString();
    }
}
