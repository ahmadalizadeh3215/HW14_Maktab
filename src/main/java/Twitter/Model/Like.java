package Twitter.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Like extends Identity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "tweet_id")
    private Tweet tweet;
    @Enumerated(EnumType.STRING)
    private TypeAction typeAction;

    public Like(Integer id, User user, Tweet tweet, TypeAction typeAction) {
        super(id);
        this.user = user;
        this.tweet = tweet;
        this.typeAction = typeAction;
    }

    public Like(User user, Tweet tweet, TypeAction typeAction) {
        this.user = user;
        this.tweet = tweet;
        this.typeAction = typeAction;
    }
}
