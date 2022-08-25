package service.repo;

import java.util.Optional;

public class RouteInfo {
    private final int id;
    private final String routeName;
    private final String mountainName;
    private final boolean isStandardRoute;
    private final boolean isSnowRoute;
    private final String grade;
    private final String trailhead;
    private final int summitElevation;
    private final int gain;
    private final int length;
    private final String exposure;
    private final String rockfallPotential;
    private final String routeFinding;
    private final String commitment;
    private final Optional<Integer> roadDifficulty;
    private final String routeUrl;
    private final String trailheadUrl;

    public RouteInfo(
            int id,
            String routeName,
            String mountainName,
            boolean isStandardRoute,
            boolean isSnowRoute,
            String grade,
            String trailhead,
            int summitElevation,
            int gain,
            int length,
            String exposure,
            String rockfallPotential,
            String routeFinding,
            String commitment,
            Optional<Integer> roadDifficulty,
            String routeUrl,
            String trailheadUrl
    ) {
        this.id = id;
        this.routeName = routeName;
        this.mountainName = mountainName;
        this.isStandardRoute = isStandardRoute;
        this.isSnowRoute = isSnowRoute;
        this.grade = grade;
        this.trailhead = trailhead;
        this.summitElevation = summitElevation;
        this.gain = gain;
        this.length = length;
        this.exposure = exposure;
        this.rockfallPotential = rockfallPotential;
        this.routeFinding = routeFinding;
        this.commitment = commitment;
        this.roadDifficulty = roadDifficulty;
        this.routeUrl = routeUrl;
        this.trailheadUrl = trailheadUrl;
    }

    public int getId() {
        return id;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getMountainName() {
        return mountainName;
    }

    public boolean isStandardRoute() {
        return isStandardRoute;
    }

    public boolean isSnowRoute() {
        return isSnowRoute;
    }

    public String getGrade() {
        return grade;
    }

    public String getTrailhead() {
        return trailhead;
    }

    public int getSummitElevation() {
        return summitElevation;
    }

    public int getGain() {
        return gain;
    }

    public int getLength() {
        return length;
    }

    public String getExposure() {
        return exposure;
    }

    public String getRockfallPotential() {
        return rockfallPotential;
    }

    public String getRouteFinding() {
        return routeFinding;
    }

    public String getCommitment() {
        return commitment;
    }

    public Optional<Integer> getRoadDifficulty() {
        return roadDifficulty;
    }

    public String getRouteUrl() {
        return routeUrl;
    }

    public String getTrailheadUrl() {
        return trailheadUrl;
    }
}
