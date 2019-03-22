package contract;


import model.Topo;

public interface TopoManager {

    Topo addTopo(Topo topo);

    void saveTopo(Topo topo);

    void deleteTopo(Long Id);
}
