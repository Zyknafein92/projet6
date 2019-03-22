package impl;


import contract.AreaManager;
import model.Area;
import org.springframework.stereotype.Component;

@Component
public class AreaManagerImpl extends ManagerImpl implements AreaManager {
    @Override
    public Area addArea(Area area) {
        return getDaoFactory().getAreaRepository().save(area);
    }

    @Override
    public void saveArea(Area area) {
        getDaoFactory().getAreaRepository().save(area);
    }

    @Override
    public void deleteArea(Long id) {
        getDaoFactory().getAreaRepository().deleteById(id);
    }
}
