package Twitter.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Follow extends Identity{
    @ManyToOne
    private User followers;
    @ManyToOne
    private User followings;

    public Follow(Integer id, User followers, User followings) {
        super(id);
        this.followers = followers;
        this.followings = followings;
    }

    public Follow(User followers, User followings) {
        this.followers = followers;
        this.followings = followings;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "followers=" + followers +
                ", followings=" + followings +
                "} " + super.toString();
    }
}
