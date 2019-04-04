package model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="climbing_road_type",schema="public" )
public enum  ClimbingRoadType implements Serializable {

    BLOC("Bouldering", "Bloc"),
    VOIE("Road","Voie"),
    GRANDEVOIE("Big Road","Grande voie"),
    RELAIS("Multi-Pich climbing","Relais"),
    FREE("Free climbing","Escalade libre"),
    ClimbingRoadType("DeepWater","Escalade maritime");

    @Id
    @OneToOne
    private ClimbingRoad climbingRoad;
    @Column(name="en")
    private String en;
    @Column(name="fr")
    private String fr;

    ClimbingRoadType() {};

    ClimbingRoadType(String en, String fr) {
        this.en = en;
        this.fr = fr;
    }

    ClimbingRoadType(ClimbingRoad climbingRoad, String en, String fr) {
        this.climbingRoad = climbingRoad;
        this.en = en;
        this.fr = fr;
    }
}