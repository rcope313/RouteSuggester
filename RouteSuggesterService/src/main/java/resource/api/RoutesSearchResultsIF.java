package resource.api;

import org.immutables.value.Value;
import service.repo.RouteInfo;

import java.util.List;

@Value.Immutable
@Value.Style(
        typeAbstract = {"*IF"}
)
public interface RoutesSearchResultsIF {
    List<RouteInfo> getRoutes();
}
