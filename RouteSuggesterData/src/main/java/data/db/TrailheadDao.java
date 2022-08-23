package data.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class TrailheadDao extends AbstractDAO<Trailhead> {

    public TrailheadDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
