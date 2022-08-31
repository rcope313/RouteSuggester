package data.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class FourteenerRouteDao extends AbstractDAO<FourteenerRoute> {

    public FourteenerRouteDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
