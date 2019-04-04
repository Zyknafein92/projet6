package model;




import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name= "area", schema="public")
public class Area implements Serializable {

    private static final long serialVersionUID = 3404260602360441894L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long area_id;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Topo.class)
    private List<Topo> topo;

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

    public Area(List<Topo> topo, String name, String description, String orientation, int roadNumber, int height) {
        this.topo = topo;
        this.name = name;
        this.description = description;
        this.orientation = orientation;
        this.roadNumber = roadNumber;
        this.height = height;
    }

    public long getArea_id() {
        return area_id;
    }

    public void setArea_id(long area_id) {
        this.area_id = area_id;
    }

    public List<Topo> getTopo() {
        return topo;
    }

    public void setTopo(List<Topo> topo) {
        this.topo = topo;
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

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
