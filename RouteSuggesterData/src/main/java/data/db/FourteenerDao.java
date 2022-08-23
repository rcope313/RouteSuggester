package data.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class FourteenerDao extends AbstractDAO<Fourteener> {

    public FourteenerDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
