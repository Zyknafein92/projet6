package model;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="spot")
public class Spot implements Serializable {

private static final long serialVersionUID = -3746412473835952080L;


    @Id
    @OneToOne(mappedBy = "topo")
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


    protected Spot () {}

    public Spot(String name, String description, String nearestCity, Boolean carAccess, Boolean carParking, String accessDescription, String nearestHospital, String supplyComment) {
        this.name = name;
        this.description = description;
        this.nearestCity = nearestCity;
        this.carAccess = carAccess;
        this.carParking = carParking;
        this.accessDescription = accessDescription;
        this.nearestHospital = nearestHospital;
        this.supplyComment = supplyComment;
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

    public String getNearestCity() {
        return nearestCity;
    }

    public void setNearestCity(String nearestCity) {
        this.nearestCity = nearestCity;
    }

    public Boolean getCarAccess() {
        return carAccess;
    }

    public void setCarAccess(Boolean carAccess) {
        this.carAccess = carAccess;
    }

    public Boolean getCarParking() {
        return carParking;
    }

    public void setCarParking(Boolean carParking) {
        this.carParking = carParking;
    }

    public String getAccessDescription() {
        return accessDescription;
    }

    public void setAccessDescription(String accessDescription) {
        this.accessDescription = accessDescription;
    }

    public String getNearestHospital() {
        return nearestHospital;
    }

    public void setNearestHospital(String nearestHospital) {
        this.nearestHospital = nearestHospital;
    }

    public String getSupplyComment() {
        return supplyComment;
    }

    public void setSupplyComment(String supplyComment) {
        this.supplyComment = supplyComment;
    }

}
