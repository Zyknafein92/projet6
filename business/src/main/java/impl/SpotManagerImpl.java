package impl;


import contract.SpotManager;
import model.Spot;
import org.springframework.stereotype.Component;

@Component
public class SpotManagerImpl extends ManagerImpl implements SpotManager {

    @Override
    public Spot addSpot(Spot spot) {
        return getDaoFactory().getSpotRepository().save(spot);
    }

    @Override
    public void saveSpot(Spot spot) {
        getDaoFactory().getSpotRepository().save(spot);
    }

    @Override
    public void deleteSpot(Long Id) {
        getDaoFactory().getSpotRepository().deleteById(Id);
    }
}
