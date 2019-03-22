package contract;


import model.Spot;

public interface SpotManager {

    Spot addSpot(Spot spot);

    void saveSpot(Spot spot);

    void deleteSpot(Long Id);
}
