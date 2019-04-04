package model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="climbing_road", schema="public")
public class ClimbingRoad implements Serializable {

    private static final long serialVersionUID = -4064657285722503024L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long climbing_road_id;


    private Area area;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="difficulty")
    private Difficulty difficulty;

    @Column(name="climbing_road_type")
    private ClimbingRoadType type;
    }

