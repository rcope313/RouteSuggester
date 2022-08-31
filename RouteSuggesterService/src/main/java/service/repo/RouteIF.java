package service.repo;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(
        typeAbstract = {"*IF"}
)
public interface RouteIF {
    String getRouteName();
    String getMountainName();
    boolean isStandardRoute();
    boolean isSnowRoute();
    String getGrade();
    String getTrailhead();
    int getSummitElevation();
    int getGain();
    int getLength();
    String getExposure();
    String getRockfallPotential();
    String getRouteFinding();
    String getCommitment();
    int getRoadDifficulty();
    String getRouteUrl();
    String getTrailheadUrl();
}
