package resource.resources;

import io.dropwizard.hibernate.UnitOfWork;
import resource.api.RoutesSearchCriteriaIF;
import resource.api.RoutesSearchResultsIF;
import service.services.RouteInfoService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    public RoutesSearchResultsIF getRoutes(RoutesSearchCriteriaIF body) {
        return null;
    }

    @POST
    @UnitOfWork
    @Path("/suggest_by_weather")
    public RoutesSearchResultsIF getSuggestedRoutes(RoutesSearchCriteriaIF body) {
        return null;
    }

    public RouteInfoService getRouteInfoService() {
        return routeInfoService;
    }
}
