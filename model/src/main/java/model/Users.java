package model;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name="users", schema="public")
public class Users implements Serializable {

    private static final long serialVersionUID = 1846864142941979370L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="users_id")
    private long user_id;


    @Column(name="name")
    private String name;
    @Column(name="real_name")
    private String realName;
    @Column(name="age")
    private int age;
    @Column(name="gender")
    private String gender;
    @Column(name="pseudo")
    private String pseudo;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="isadmin")
    private Boolean admin;


}
