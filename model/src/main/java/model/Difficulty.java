package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name= "difficulty")
public class Difficulty implements Serializable {

    private static final long serialVersionUID = -645706496535438905L;

    @OneToOne(mappedBy = "climbing_road")
    private ClimbingRoad climbingRoad;
    @Column(name="number")
    private int number;
    @Column(name="letter")
    private char letter;
    @Column(name="symbole")
    private char symbole;

    protected Difficulty () {}

    public Difficulty(ClimbingRoad climbingRoad, int number, char letter, char symbole) {
        this.climbingRoad = climbingRoad;
        this.number = number;
        this.letter = letter;
        this.symbole = symbole;
    }

    public ClimbingRoad getClimbingRoad() {
        return climbingRoad;
    }

    public void setClimbingRoad(ClimbingRoad climbingRoad) {
        this.climbingRoad = climbingRoad;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }
}