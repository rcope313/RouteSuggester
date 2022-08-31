package service.repo;

import data.db.FourteenerRouteDao;
import data.db.TrailheadDao;

public class RouteInfoRepository {
    private final TrailheadDao trailheadDao;
    private final FourteenerRouteDao fourteenerRouteDao;

    public RouteInfoRepository(TrailheadDao trailheadDao, FourteenerRouteDao fourteenerRouteDao) {
        this.trailheadDao = trailheadDao;
        this.fourteenerRouteDao = fourteenerRouteDao;
    }

    public TrailheadDao getTrailheadDao() {
        return trailheadDao;
    }

    public FourteenerRouteDao getFourteenerDao() {
        return fourteenerRouteDao;
    }
}
