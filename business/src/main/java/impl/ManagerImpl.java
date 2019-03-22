package impl;


import contract.DaoFactory;
import org.springframework.stereotype.Component;

@Component
public abstract class ManagerImpl {

    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}
