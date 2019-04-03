package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="topo", schema="public")
public class Topo implements Serializable {

    private static final long serialVersionUID = -3508876800528676776L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long topo_id;

    @Column(name="name")
    private String name;

    @ManyToOne()
    private Users user;

    @OneToOne(mappedBy = "department")
    private Department department;

    protected Topo () {};

    public Topo(String name, Users user, Department department) {

        this.name = name;
        this.user = user;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}