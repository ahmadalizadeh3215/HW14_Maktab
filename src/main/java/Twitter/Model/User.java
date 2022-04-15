package Twitter.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
@NoArgsConstructor
@Getter
@Setter
@Entity

public class User extends Identity {
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @OneToMany(mappedBy = "followers")
    private Set<Follow> follower;

    @OneToMany(mappedBy = "followings")
    private Set<Follow> following;
    @OneToMany(mappedBy = "user")
    private Set<Like> likes;
    @OneToMany(mappedBy = "user")
    private Set<Tweet> tweets;

    public User(Integer id, String username, String password, Set<Follow> follower, Set<Follow> following,Set<Like> likes,Set<Tweet> tweets) {
        super(id);
        this.username = username;
        this.password = password;
        this.follower = follower;
        this.following = following;
        this.likes=likes;
        this.tweets=tweets;
    }

    public User(String username, String password, Set<Follow> follower, Set<Follow> following,Set<Like> likes,Set<Tweet> tweets) {
        this.username = username;
        this.password = password;
        this.follower = follower;
        this.following = following;
        this.likes=likes;
        this.tweets=tweets;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", follower=" + follower +
                ", following=" + following +
                "} " + super.toString();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
