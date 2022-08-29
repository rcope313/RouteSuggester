package resource.api;

import org.immutables.value.Value;
import service.repo.RouteInfo;

import java.util.List;

@Value.Immutable
public interface RoutesSearchResultsIF {
    List<RouteInfo> getRoutes();
}
