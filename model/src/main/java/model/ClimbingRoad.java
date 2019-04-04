package model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="climbing_road", schema="public")
public class ClimbingRoad implements Serializable {

    private static final long serialVersionUID = -4064657285722503024L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long climbing_road_id;

    @ManyToOne()
    private Area area;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="difficulty")
    private Difficulty difficulty;

    @Column(name="climbing_road_type")
    private ClimbingRoadType type;

    protected ClimbingRoad () {}

    public ClimbingRoad(String name, String description, ClimbingRoadType type, Difficulty difficulty) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public ClimbingRoadType getType() {
        return type;
    }

    public void setType(ClimbingRoadType type) {
        this.type = type;
    }
}