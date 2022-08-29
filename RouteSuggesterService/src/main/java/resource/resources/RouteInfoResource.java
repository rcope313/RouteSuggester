package resource.resources;

import io.dropwizard.hibernate.UnitOfWork;
import resource.api.ImmutableRoutesSearchCriteria;
import resource.api.ImmutableRoutesSearchResults;
import service.repo.RouteInfo;
import service.services.RouteInfoService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/routes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RouteInfoResource {
    private final RouteInfoService routeInfoService;

    public RouteInfoResource(RouteInfoService routeInfoService) {
        this.routeInfoService = routeInfoService;
    }

    @POST
    @UnitOfWork
    public ImmutableRoutesSearchResults getRoutes(ImmutableRoutesSearchCriteria body) {
        List<RouteInfo> routes = routeInfoService.getRoutesBySearchCriteria(body);
        return ImmutableRoutesSearchResults
                .builder()
                .addAllRoutes(routes)
                .build();
    }

    @POST
    @UnitOfWork
    @Path("/suggest_by_weather")
    public ImmutableRoutesSearchResults getSuggestedRoutes(ImmutableRoutesSearchCriteria body) {
        List<RouteInfo> routes = routeInfoService.getRoutesBySearchCriteriaAndWeather(body);
        return ImmutableRoutesSearchResults
                .builder()
                .addAllRoutes(routes)
                .build();
    }

    public RouteInfoService getRouteInfoService() {
        return routeInfoService;
    }
}
