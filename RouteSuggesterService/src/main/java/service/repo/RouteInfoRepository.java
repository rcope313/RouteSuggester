package service.repo;

import data.db.FourteenerDao;
import data.db.TrailheadDao;

public class RouteInfoRepository {
    private final TrailheadDao trailheadDao;
    private final FourteenerDao fourteenerDao;

    public RouteInfoRepository(TrailheadDao trailheadDao, FourteenerDao fourteenerDao) {
        this.trailheadDao = trailheadDao;
        this.fourteenerDao = fourteenerDao;
    }

    public TrailheadDao getTrailheadDao() {
        return trailheadDao;
    }

    public FourteenerDao getFourteenerDao() {
        return fourteenerDao;
    }
}
