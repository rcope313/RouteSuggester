package resource.api;

import org.immutables.value.Value;
import java.util.Optional;

@Value.Immutable
public interface RoutesSearchCriteriaIF {
    Optional<String> getRouteName();
    Optional<String> getMountainName();
    Optional<Boolean> getIsStandardRoute();
    Optional<Boolean> getIsSnowRoute();
    Optional<Integer> getGrade();
    Optional<String> getTrailhead();
    Optional<Integer> getSummitElevation();
    Optional<Integer> getGain();
    Optional<Integer> getLength();
    Optional<String> getExposure();
    Optional<String> getRockfallExposure();
    Optional<String> getRouteFinding();
    Optional<String> getCommitment();
    Optional<Integer> getRoadDifficulty();


}
