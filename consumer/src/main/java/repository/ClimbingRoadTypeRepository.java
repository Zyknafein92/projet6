package repository;


import model.ClimbingRoadType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimbingRoadTypeRepository extends JpaRepository <ClimbingRoadType, Long> {
}
