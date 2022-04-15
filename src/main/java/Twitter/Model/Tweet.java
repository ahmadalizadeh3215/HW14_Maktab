package Twitter.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Tweet extends Identity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(nullable = false , columnDefinition = "varchar(280)")
    private String description;
    @Column(name = "time")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public Tweet(Integer id, User user, String description, Date time) {
        super(id);
        this.user = user;
        this.description = description;
        this.time = time;
    }

    public Tweet(User user, String description, Date time) {
        this.user = user;
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "user=" + user +
                ", description='" + description + '\'' +
                ", time=" + time +
                "} " + super.toString();
    }
}
