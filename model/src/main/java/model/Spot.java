package model;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="spot", schema="public")
public class Spot implements Serializable {

private static final long serialVersionUID = -3746412473835952080L;


    @Id
    @OneToOne(mappedBy="topo")
    @JoinColumn(name = "topo_id")
    private Topo topo;

    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="nearest_city")
    private String nearestCity;
    @Column(name="car_access")
    private Boolean carAccess;
    @Column(name="car_parking")
    private Boolean carParking;
    @Column(name="access_description")
    private String accessDescription;
    @Column(name="nearest_hospital")
    private String nearestHospital;
    @Column(name="supply_comment")
    private String supplyComment;

}
