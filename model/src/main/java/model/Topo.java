package model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="topo", schema="public")
public class Topo implements Serializable {

    private static final long serialVersionUID = -3508876800528676776L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long topo_id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "users")
    private Users user;

    @OneToOne(mappedBy = "department")
    private Department department;



}

