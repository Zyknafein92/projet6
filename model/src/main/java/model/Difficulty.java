package model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name= "difficulty", schema="public")
public class Difficulty implements Serializable {

    private static final long serialVersionUID = -645706496535438905L;

    @Id
    private int difficultyID;


   // private ClimbingRoad climbingRoad;

    @Column(name="number")
    private int number;

    @Column(name="letter")
    private char letter;

    @Column(name="symbole")
    private char symbole;

}