package model;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1846864142941979370L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    protected Users () {

    }

    public Users(String name, String realName, int age, String gender, String pseudo, String password, String email, String phoneNumber, Boolean admin) {
        this.name = name;
        this.realName = realName;
        this.age = age;
        this.gender = gender;
        this.pseudo = pseudo;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", admin=" + admin +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}