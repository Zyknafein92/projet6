package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="admin", schema="public")
public class Admin implements Serializable {

    private static final long serialVersionUID = -4670821279364950300L;

    @Id
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    protected Admin() {}

    public Admin(Users user) {
        this.user = user;
    }
}
