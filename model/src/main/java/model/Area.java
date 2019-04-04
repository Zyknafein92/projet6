package model;




import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name= "area", schema="public")
public class Area implements Serializable {

    private static final long serialVersionUID = 3404260602360441894L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long area_id;


    private Spot spot;


    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="orientation")
    private String orientation;
    @Column(name="road_number")
    private int roadNumber;
    @Column(name="height")
    private int height;

}
