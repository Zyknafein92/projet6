package impl;

import com.truespot.openclassroom.model.model.Topo;
import com.truespot.openclassroom.truespotbusiness.contract.TopoManager;
import org.springframework.stereotype.Component;

@Component
public class TopoManagerImpl extends ManagerImpl implements TopoManager {

    @Override
    public Topo addTopo(Topo topo) {
        return getDaoFactory().getTopoRepository().save(topo);
    }

    @Override
    public void saveTopo(Topo topo) {
     getDaoFactory().getTopoRepository().save(topo);
    }

    @Override
    public void deleteTopo(Long Id) {
     getDaoFactory().getTopoRepository().deleteById(Id);
    }
}
