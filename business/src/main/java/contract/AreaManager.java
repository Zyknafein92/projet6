package contract;


import model.Area;

public interface AreaManager {

    Area addArea(Area area);

    void saveArea(Area area);

    void deleteArea(Long id);
}
