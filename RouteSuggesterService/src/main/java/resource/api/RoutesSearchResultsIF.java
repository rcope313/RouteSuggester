package resource.api;

import org.immutables.value.Value;
import service.repo.ImmutableRoute;

import java.util.List;

@Value.Immutable
@Value.Style(
        typeAbstract = {"*IF"}
)
public interface RoutesSearchResultsIF {
    List<ImmutableRoute> getRoutes();
}
