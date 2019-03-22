package repository;


import model.ClimbingRoad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimbingRoadRepository extends JpaRepository <ClimbingRoad, Long> {

}
